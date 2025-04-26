package stringExamples;

import java.util.ArrayList;
import java.util.Arrays;
/*
Time complexity - O(n*m), where n is number of strings and m is size of maximum string.
Space complexity - o(1)
 */
public class MinimumDistanceBetweenStrings {
    public int findMinimumDistance(ArrayList<String> str, String word1, String word2) {
        //Set 2 index first and second as -1
        //Set answer to Integer max value
        int index = -1;
        int secondIndex = -1;
        int ans = Integer.MAX_VALUE;
        //Iterate over ArrayList or array
        for (int i = 0; i < str.size(); i++) {
            //if matches word1 then set first index to i
            if(str.get(i).equals(word1)) {
                index = i;
            }
            // if matches word2 then set second index to i
            if(str.get(i).equals(word2)) {
                secondIndex = i;
            }
            //if first and second indexes not equal to -1 then calculate min distance using
            // answer value assigned and absolute value of first - second index
            if(index != -1 && secondIndex != -1) {
                ans = Math.min(ans, Math.abs(index - secondIndex));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("the", "melon", "and", "fox", "are", "going", "home"));
        MinimumDistanceBetweenStrings m = new MinimumDistanceBetweenStrings();
        String word1 = "the";
        String word2 = "fox";
        System.out.println(m.findMinimumDistance(str, word1, word2));
    }
}
