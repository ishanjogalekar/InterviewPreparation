package stringExamples;

public class Pangram {
    public boolean isPangram(String input) {
        input = input.toLowerCase();
        boolean isPangram = true;
        for (char c ='a'; c <= 'z'; c++) {
            if(!input.contains(String.valueOf(c))){
                isPangram = false;
                break;
            }
        }
        return isPangram;
    }
    public static void main(String[] args) {
        Pangram p = new Pangram();
        String input = "abc";
        System.out.println(p.isPangram(input));
    }
}
