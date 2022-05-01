package src;

public class RotatedString {
    public static boolean isRotated(String str1, String str2)
    {
        String middleEnd=str1.substring(2,str1.length());
        String start=str1.substring(0,2);
        if(str2.equals(middleEnd.concat(start)) || str2.equals(start.concat(middleEnd)) ){
            return true;
        }

        String end=str1.substring(str1.length()-2,str1.length());
        String startMiddle=str1.substring(0,str1.length()-2);

        if(str2.equals(startMiddle.concat(end)) || str2.equals(end.concat(startMiddle))){
            return true;
        }

return false;

    }
}

class RotatedStringStarter {
    public static void main(String[] args) {
        RotatedString rotatedString=new RotatedString();
       // System.out.println(RotatedString.isRotated("amazon","azonam"));
        System.out.println(RotatedString.isRotated("fsbcnuvqhffbsaqxwp","wpfsbcnuvqhffbsaqx"));

    }
}
