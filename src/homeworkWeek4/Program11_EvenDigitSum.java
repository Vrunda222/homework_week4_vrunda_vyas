package homeworkWeek4;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

public class Program11_EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            int rem = 0;
            int tempNum = number;
            while (tempNum > 0) {
                rem = tempNum % 10;
                if (rem % 2 == 0) {
                    sum = sum + rem;
                }
                tempNum = tempNum / 10;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));  //should return 20
        System.out.println(getEvenDigitSum(252));  //should return 4
        System.out.println(getEvenDigitSum(-22));  //should return -1

    }
}
