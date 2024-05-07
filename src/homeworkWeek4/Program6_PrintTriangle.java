package homeworkWeek4;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

public class Program6_PrintTriangle {

    public static void printTriangle(int rowNum) {
        int i, j;
        for (i = 1; i <= rowNum; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println("");
        }
    }

    public static void main(String[] args) {

        //declare scanner class to read input from user
        Scanner scn = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int rowNum = scn.nextInt();

        //calling  method to print pattern
        printTriangle(rowNum);
        //closing scanner object
        scn.close();

    }
}
