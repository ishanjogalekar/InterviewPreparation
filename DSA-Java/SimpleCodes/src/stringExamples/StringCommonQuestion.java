package stringExamples;

/*
- In Java Strings are immutable, they stored in String-Pool memory location
- String treated as class and variable is like object to that class
 */
public class StringCommonQuestion {
    public static void main(String[] args) {
        //String initialized
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("AbC");

        System.out.println(str1 == str2); // true - as it refers to same memory locations it's like references
        System.out.println(str1 == str3); // false - here str3 invokes into new memory location and == operator check reference not content

        //to check contents use below methods - All will be true
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str4));
    }
}
