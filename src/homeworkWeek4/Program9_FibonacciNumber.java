package homeworkWeek4;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Program9_FibonacciNumber {

    public static void printFibonacci(int num) {
        int num1 = 1;
        int num2 = 1;

        for (int i = 1; i <= num; ++i) {
            System.out.print(num1 + " ");
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }

    public static void main(String[] args) {
        int num=8;
        printFibonacci(num);
    }
}
