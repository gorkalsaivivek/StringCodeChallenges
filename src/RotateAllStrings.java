package src;

public class RotateAllStrings {
    public static boolean areRotations(String s1, String s2 )
    {
        if(s1.length()!=s2.length()){
            return false;
        }

        if(s1.concat(s1).contains(s2)){
            return true;
        }
        return false;
    }
}

class RotateAllStringsStarter {
    public static void main(String[] args) {

    }
}
