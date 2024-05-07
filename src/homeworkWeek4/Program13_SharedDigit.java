package homeworkWeek4;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class Program13_SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 90 || b < 10 || b > 90) {
            return false;
        }
        int compare1 = 0;
        int compare2 = 0;
        while (a > 0) {
            compare1 = a % 10;
            a = a / 10;
            int tempNum = b;
            while (tempNum > 0) {
                compare2 = tempNum % 10;
                tempNum = tempNum / 10;
                if (compare1 == compare2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));  //true
        System.out.println(hasSharedDigit(9,99));  //false
        System.out.println(hasSharedDigit(15,55)); //true
    }
}
