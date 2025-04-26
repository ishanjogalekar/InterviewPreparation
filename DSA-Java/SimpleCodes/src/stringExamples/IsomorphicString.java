package stringExamples;

import java.util.HashMap;

public class IsomorphicString {
    public boolean isIsomorphic(String a, String b) {
        //If length is not same return false directly
        if(a.length() != b.length())
            return false;

        //Create two hashmaps to store each character of strings at particular indexes
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        //iterate over map
        for(int i = 0; i < a.length(); i++){
            //Only put if its absent - otherwise update at same index
            m1.putIfAbsent(a.charAt(i), i);
            m2.putIfAbsent(b.charAt(i), i);

            //If character at index not equal with other map index return false
            if(!m1.get(a.charAt(i)).equals(m2.get(b.charAt(i)))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "egg";
        String b = "add";
        IsomorphicString isomorphicString = new IsomorphicString();
        System.out.println(isomorphicString.isIsomorphic(a, b));
    }
}
