package stringExamples;

import java.util.Arrays;

public class LongestCommonPrefix {
    /*
    - 1. To find the longest common prefix - only compare first and last String of sorted array
    - 2. First sort array
    - 3. Get First and last String from array and find minimum length using Math.Min
    - 4. Using while loop index  till min length and first == last character
    - 5. Return substring for first element 0 to index
    - 6. Time Complexity: O(n*m*log n) - m is length of longest String and n is no of strings
    - 7. Auxiliary Space: O(m) - to store first,last and result
     */
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        int minLength = Math.min(first.length(), last.length());

        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }
    public static void main(String[] args) {
        String[] arr = {
                "geeksforge","geek","geekse"
        };
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(arr));
    }


}
