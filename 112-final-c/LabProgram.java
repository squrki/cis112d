import java.util.Scanner;

public class LabProgram {
    // Write a recursive method called reverseString() that takes in a string as a
    // parameter and returns the string in reversed order. The main method is
    // provided to read a string from the user and call the reverseString() method.
    public static String reverseString(String s) {
        // Base case: if the string is empty or has one character, return it as is
        if (s.length() <= 1) {
            return s;
        }
        // Recursive case: reverse the substring from index 1 to end and append the
        // first character at the end
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input, result;

        input = scnr.nextLine();
        result = reverseString(input);
        System.out.printf("Reverse of \"%s\" is \"%s\".", input, result);
    }
}
