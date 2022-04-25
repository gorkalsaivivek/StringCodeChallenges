package src;

public class BinarySubstring {
    public static int binarySubstring(int a, String str)
    {
        int count=0;

                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)=='1'){
                        count++;
                    }
                }

        return count;
        }

    }



class BinarySubstringStarter {
    public static void main(String[] args) {
        BinarySubstring binarySubstring=new BinarySubstring();
        System.out.println(binarySubstring.binarySubstring(4,"1111"));
        System.out.println(binarySubstring.binarySubstring(5,"01101"));
    }
}