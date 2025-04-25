package stringExamples;

//Program to check string is palindrome or not
//e.g.- . abba - is palindrome , reverse  of String is also same
public class Palindrome {
    /*
    1. Two Point technique - o(n) time complexity and o(1) Space
    2. Create left and right points, left = 0 & right = len-1
    3. Use while loop till left < right and check char in String at right & left points
    4. if not equal then return 0 otherwise left++ and  right --
    5. Outside of loop return 1;
     */
    public int checkStringIsPalindromeUsingPointers(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }

    //Check using StringBuilder -  o(n) time complexity and o(n) - Space
    public int checkPalindromeUsingStringBuilder(String str) {
        /*
        1. Use String equals method in that create new StringBuilder and pass String
        2. Use StringBuilder reverse function and use .toString() time conversion
        3. Using ternary operator if string equals then 1 else 0
        4. Instead of equals and .toString() can use content-equals method as well
         */
        return str.equals(new StringBuilder(str).reverse().toString()) ? 1 : 0;
    }

    public static void main(String[] args) {
        String str  = "abba";
        Palindrome p = new Palindrome();
        System.out.println(p.checkStringIsPalindromeUsingPointers(str));
        System.out.println(p.checkPalindromeUsingStringBuilder(str));
    }
}
