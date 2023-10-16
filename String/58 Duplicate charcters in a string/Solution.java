import java.util.*;

class Solution {

    public static void printDuplicateCharcters(String s){
        Map<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }else{
                mp.put(s.charAt(i),1);
            }
        }

        for (Character j : mp.keySet()) {
            System.out.println("Character " + j + " appears : " + mp.get(j) + " times");
        }
    }

    public static void main(String[] args) {
        String s = new String("Hello");
        printDuplicateCharcters(s);
    }
}