package stringExamples;

public class FindNonRepeatingCharacter {

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
        String str = "Swiss";
        System.out.println(findNonRepeatingCharacter.findNonRepeatingCharacter(str.toLowerCase()));
    }
}
