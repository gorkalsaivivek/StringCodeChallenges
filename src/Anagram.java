package src;

import java.util.HashMap;

public class Anagram {

    public static boolean isAnagram(String a,String b)
    {
        HashMap<Character,Integer> hashMap1=new HashMap<>();
        HashMap<Character,Integer> hashMap2=new HashMap<>();

        for(int i=0;i<a.length();i++){
            hashMap1.put(a.charAt(i),hashMap1.getOrDefault(a.charAt(i),0)+1);

        }
        for(int i=0;i<b.length();i++){
            hashMap2.put(b.charAt(i),hashMap2.getOrDefault(b.charAt(i),0)+1);

        }

        return hashMap1.equals(hashMap2);

    }


}

class AnagramStarter {

    public static void main(String[] args) {
        Anagram anagram=new Anagram();
        System.out.println(anagram.isAnagram("geeksforgeeks","forgeeksgeeks"));
        System.out.println(anagram.isAnagram("allergy","allergic"));
    }

}
