package src;

import java.util.*;
import java.util.stream.Collectors;

public class MaxOccuringCharacter {

    public static char getMaxOccuringChar(String line)
    {
        HashMap<Character,Integer> hashMap=new HashMap<>();

        for(int i=0;i<line.length();i++){
            hashMap.put(line.charAt(i), hashMap.getOrDefault(line.charAt(i),0)+1);
        }
        int maxValue=0;
        for(Map.Entry map: hashMap.entrySet()){
           if(maxValue<(int)map.getValue()){
               maxValue=(int)map.getValue();
           }
        }
        int maxfound=maxValue;

        List<Character> characterList= new ArrayList<>();
        for(Map.Entry element: hashMap.entrySet()){
            if((int)element.getValue()==maxfound) {
                characterList.add((Character) element.getKey());
            }
        }

        Collections.sort(characterList);

        return characterList.get(0);
    }
}

class MaxOccuringCharacterStarter {
    public static void main(String[] args) {
        MaxOccuringCharacter maxOccuringCharacter=new MaxOccuringCharacter();
        System.out.println(maxOccuringCharacter.getMaxOccuringChar("testsample"));
        //maxOccuringCharacter.getMaxOccuringChar("output");
    }
}
