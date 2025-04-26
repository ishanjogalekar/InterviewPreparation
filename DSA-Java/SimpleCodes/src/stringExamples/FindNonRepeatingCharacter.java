package stringExamples;

import java.util.Arrays;

public class FindNonRepeatingCharacter {

    /*
     - Approach by storing frequency of each character
     - 1. Iterate over String and Store frequency in array
     - 2. Iterate over String again and check frequency [char - 'a] == 1
     - 3. return that character
     - 4. if no character found return dollar
     - 5. Time - O(Characters * N) and Space O(n)
     */

    public char findNonRepeatingCharacter(String str) {
        int[] freq = new int[26];

        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        // Find the first character with frequency 1
        for (char c : str.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        FindNonRepeatingCharacter findNonRepeatingCharacter = new FindNonRepeatingCharacter();
        String str = "Swisswi";
        System.out.println(findNonRepeatingCharacter.findNonRepeatingCharacter(str.toLowerCase()));
    }
}
