package stringExamples;

public class ReverseWordsInString {
    /*
    1. Convert String to Array and split it as regex " +"
    2. Now traverse using for loop from end of String to it index i>=0
    3. Append to StringBuilder using array[i] and if (i!=0) append " "
    4. Return string with trim() function
     */
    public String reverseWords(String str) {
        String[] words = str.split(" +");
        StringBuilder reversedWords = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {
            reversedWords.append(words[i]);
            if(i!=0){
                reversedWords.append(" ");
            }
        }
        return reversedWords.toString().trim();
    }

    public static void main(String[] args) {
        String str = "I am a student";
        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
        System.out.println(reverseWordsInString.reverseWords(str));
    }
}
