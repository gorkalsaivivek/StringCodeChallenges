package src;

public class StrStr {

    int strstr(String s, String x)
    {
        if(s.contains(x)){
           for(int i=0;i<=s.length()-x.length();i++){
               if(s.substring(i,i+x.length()).equals(x)){
                   return i;
               }
           }
        }
        else {
            return -1;
        }
        return 0;
    }
}


class StrStrStarter {
    public static void main(String[] args) {
        StrStr str=new StrStr();
        System.out.println(str.strstr("abcabcabcd","abcd"));
    }

}