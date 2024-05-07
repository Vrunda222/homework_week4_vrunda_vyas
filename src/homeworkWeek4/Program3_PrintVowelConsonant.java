package homeworkWeek4;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class Program3_PrintVowelConsonant {

    public static void printVowelConsonant(String str) {
        boolean uppercase = str.charAt(0) >= 65 && str.charAt(0) <= 90;
        boolean lowercase = str.charAt(0) >= 97 && str.charAt(0) <= 122;
        boolean vowels = str.equals("a") || str.equals("e") || str.equals("i")
                || str.equals("o") || str.equals("u");

        if (str.length() > 1) {
            System.out.println("Error. Not a single character.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        } else if (vowels) {
            System.out.println(str+" is Vowel");
        } else {
            System.out.println(str+" is Consonant");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a letter between a and z or A and Z): ");
        String str = scn.next().toLowerCase();
        printVowelConsonant(str);
        scn.close();

    }
}
