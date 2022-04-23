package src;

public class PatternSearch {
    static boolean search(String pat, String txt) {

        int j = 0;
        for (int i = 0; i < pat.length(); i++) {
            if (txt.charAt(i) == pat.charAt(j)) {
                j++;
            } else {
                j = 0;
            }
            if (j == txt.length())
                return true;
        }
        return false;

    }

}

class PatternSearchStarter {
    public static void main(String[] args) {
        PatternSearch patternSearch=new PatternSearch();
        patternSearch.search("aabaacaadaabaaabaa","aaba");
    }
}