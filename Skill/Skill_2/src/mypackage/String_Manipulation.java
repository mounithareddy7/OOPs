package mypackage;
public class String_Manipulation {
    public static void main(String[] args) {
        
      
        String name = "Java";
        String greeting = "Hello " + name;  // concatenation
        System.out.println("Example 1: Concatenation & Length");
        System.out.println(greeting);
        System.out.println("Length: " + greeting.length());
        System.out.println(); // blank line

       
        String text = "Programming";
        System.out.println("Example 2: Changing Case");
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println();


        String str = "Hello";
        str.concat(" World"); // creates new string but not stored
        System.out.println("Example 3: Immutability Demo");
        System.out.println(str); // still "Hello"
    }
}
