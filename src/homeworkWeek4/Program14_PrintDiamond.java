package homeworkWeek4;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 *            *
 *           ***
 *          *****
 *         *******
 *        *********
 *       ***********
 *       *************
 *        ***********
 *        *********
 *         *******
 *          *****
 *           ***
 *            *
 */

public class Program14_PrintDiamond {

    public static void printDiamond(int n){

        int i = 1;
        int j;

        while (i <= n) {
            j = 1;

            while (j++ <= n - i) {

                System.out.print(" ");
            }

            j = 1;
            while (j++ <= i * 2 - 1) {
                // Print star
                System.out.print("*");
            }

            System.out.println();
            i++;
        }

        i = n - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = scn.nextInt();
        printDiamond(n);
        scn.close();

    }
}
