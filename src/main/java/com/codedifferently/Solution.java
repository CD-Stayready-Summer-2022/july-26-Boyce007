package com.codedifferently;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String howManyLettersDoYouSee(String input){

        Map<Character,Integer> map = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            if(map.containsKey(input.charAt(i))) {
                Integer value = map.get(input.charAt(i)) +1;
                map.put(input.charAt(i),value);
            } else {
                map.put(input.charAt(i),1);
            }
        }
        String letters = "";
        for (Character key:map.keySet()) {
            letters+= String.format("%s:%d ",key,map.get(key));
        }

        return letters.trim();
    }
}
