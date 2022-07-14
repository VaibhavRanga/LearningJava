package ApnaCollege;

public class L17Recursion1 {
    /*public static void printNumbers(int num) {
        if (num < 1)
            return;
        System.out.println(num);
        printNumbers(num - 1);
    }
    public static void main(String[] args) {            //prints numbers from 5 to 1
        printNumbers(5);
    }

     */



    /*public static void printNumbers(int num) {
        if (num > 5)
            return;
        System.out.println(num);                                    //prints numbers from 1 to 5
        printNumbers(num+1);
    }

    public static void main(String[] args) {
        printNumbers(1);
    }

     */



    /*public static void printSum(int i, int n, int sum) {                  //prints sum of n natural numbers
        if (i > n) {
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
//        System.out.println(i);        // prints the value of i in reverse order as the control returns to main function in the memory stack
    }

    public static void main(String[] args) {
        printSum(1, 5, 0);
    }

     */



    /*public static void calcSum(int num, int sum) {                //another way to print sum of n natural numbers
        if (num == 0) {
            System.out.println(sum);
            return;
        }
        sum += num;
        calcSum(num-1, sum);
    }

    public static void main(String[] args) {
        calcSum(10, 0);
    }

     */



    /*public static int calcSum(int num, int sum) {               //another way to print sum of n natural numbers
        if (num == 0)
            return 0;
        int calcS = calcSum(num-1, sum);
        return calcS + num;
    }

    public static void main(String[] args) {
        System.out.println(calcSum(5, 0));
    }

     */



    /*public static void calculateFactorial(int i, int n, int factorial) {                    //calculates factorial
        if (i > n) {
            System.out.println(factorial);
            return;
        }
        factorial *= i;
        calculateFactorial(i+1, n, factorial);
    }

    public static void main(String[] args) {
        calculateFactorial(1, 5, 1);
    }

     */



    /*public static int calcFactorial(int n) {                      //another way of calculating factorial using recursion
        if (n == 1 || n == 0)
            return 1;
        int factNM1 = calcFactorial(n-1);
        int factN = n * factNM1;
        return factN;
    }

    public static void main(String[] args) {
        int n=5;
        int ans = calcFactorial(n);
        System.out.println(ans);
    }

     */




    /*public static void printFibonacci(int a, int b, int n) {          //fibonacci series using recursion
        if(n == 0) {
            return;
        }
        System.out.print(a + " ");
        printFibonacci(b, a+b, n-1);
    }
    public static void main(String[] args) {
        printFibonacci(0, 1, 1);
    }

     */



    /*public static int calcPower(int base, int exponent) {
        if (exponent < 1)
            return 1;
        if (base == 0)
            return 0;
        int calcPNM1 = calcPower(base, exponent-1);                 //calculates x^n (stack height n)
        int calcPow = base * calcPNM1;
        return calcPow;
    }

    public static void main(String[] args) {
        System.out.println(calcPower(10, 3));
    }

     */



    /*public static int calcPower(int base, int exponent) {               //calculates x^n (stack height log n)
        if (exponent == 0)
            return 1;
        if (base == 0)
            return 0;
        if (exponent % 2 == 0)
            return calcPower(base, exponent/2) * calcPower(base, exponent/2);
        else
            return calcPower(base, exponent/2) * calcPower(base, exponent/2) * base;
    }
    public static void main(String[] args) {
        System.out.println(calcPower(10, 5));
    }

     */

}