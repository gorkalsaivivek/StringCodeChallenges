package src;

public class BinaryString {
    int value=1;
    public int digitsInFactorial(int N){
        value=valueFactorial(N);
        System.out.println(value);
        return String.valueOf(value).length();

    }
    public int valueFactorial(int num){
        if(num==0||num==1){
            return 1;
        }
        return num * valueFactorial(num-1);
    }
}

class BinaryStringStarter{
    public static void main(String[] args) {
        BinaryString binaryString=new BinaryString();
        binaryString.digitsInFactorial(19);
    }
}
