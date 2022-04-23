package src;

public class BinarySubstring {
    public static int binarySubstring(int a, String str)
    {

        int start=0;
        int count=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!='1') {
                start++;
            }
            if(str.charAt(end)!='1') {
                end--;
            }

            if(str.charAt(start)=='1' && str.charAt(end)=='1'){
                count++;
                end--;
            }
            if(start<str.length() && (end-start==1 || end-start==0)){
                start++;
                end=str.length()-1;
            }

        }
        return count;
    }
}


class BinarySubstringStarter {
    public static void main(String[] args) {
        BinarySubstring binarySubstring=new BinarySubstring();
        binarySubstring.binarySubstring(4,"1111");
    }
}