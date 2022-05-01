package src;

public class StringSubSequence {
    public static boolean isSubSequence(String A, String B)
    {
        int j = 0;
        int n = B.length();

        for(int i=0;i<n;i++){
            if(A.charAt(j) == B.charAt(i)){
                j++;
                if(j == A.length()){
                    return true;
                }
            }
        }
        return false;
    }
}

class StringSubSequenceStarter {
    public static void main(String[] args) {
        StringSubSequence.isSubSequence("AASDFGHJKLLKJHGFDSAASDFGHJKLLKJHGFDSAASDFGHJKL","ASDFGHJKLLKJHGFDSAASDFGHJKLLKJHGFDSAASDFGHJKLASDF");
      //  StringSubSequence.isSubSequence("gksrek","geeksforgeeks");

    }
}
