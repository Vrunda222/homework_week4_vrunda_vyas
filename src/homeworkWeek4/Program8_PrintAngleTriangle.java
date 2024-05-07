package homeworkWeek4;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class Program8_PrintAngleTriangle {

    public static void printAngleTriangle(int num) {
        int i, j;
        for (i = 0; i < num; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int num = scn.nextInt();
        printAngleTriangle(num);
        scn.close();
    }
}
