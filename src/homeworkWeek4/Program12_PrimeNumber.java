package homeworkWeek4;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

public class Program12_PrimeNumber {

    public static boolean checkNumIsPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        if (checkNumIsPrime(num)) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is a non-prime number");
        }
        scn.close();
    }

}
