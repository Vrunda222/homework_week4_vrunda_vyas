package homeworkWeek4;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

//note: if user enters other than numbers it break from loop and print mx and min value

public class Program2_MinAndMaxInputChallenge {

   static int num;
    public static void minMaxNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter numbers( done or to stop): ");
        int max = scn.nextInt();
        int min = scn.nextInt();
        while (scn.hasNextInt()) {
            num = scn.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("max number: " + max);
        System.out.println("min number: " + min);
        scn.close();
    }

    public static void main(String[] args) {
        minMaxNumber();
    }
}

