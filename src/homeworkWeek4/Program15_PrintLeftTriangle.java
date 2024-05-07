package homeworkWeek4;

/**
 * 15. Display left angle triangle of * using nested for loops
 *
 *    *
 *    * *
 *    * * *
 *    * * * *
 *    * * * * *
 */
public class Program15_PrintLeftTriangle {

        // method for print left triangle
        public static void leftTriangle(int n)
        {
            int i, j;
            for (i = 0; i < n; i++) {
                for (j = 2 * (n - i); j >= 0; j--) {
                    System.out.print(" ");
                }
                for (j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        // declare main method
        public static void main(String args[])
        {
            int n = 5;
            leftTriangle(n);
        }

}
