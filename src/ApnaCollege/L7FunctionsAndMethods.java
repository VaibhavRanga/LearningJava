package ApnaCollege;

import java.util.Scanner;

public class L7FunctionsAndMethods {

    /*public static void printMyName(String name) {         //prints hello + name
        System.out.println("Hello " + name + "!");
        return;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        printMyName(name);
    }

     */




    /*public static float calculateSum(float a, float b) {        //calculates the sum of two numbers
        float sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        float a= scan.nextFloat();
        System.out.println("Enter another number");
        float b= scan.nextFloat();
        float sum= calculateSum(a, b);
        System.out.println("Sum of the two numbers is: " + sum);
    }

     */



    /*public static float calculateProduct(float a, float b) {              //calculates the product of two numbers
        return a*b;                                                         //the product can be returned directly
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        float a= scan.nextFloat();
        System.out.println("Enter another number");
        float b= scan.nextFloat();
        System.out.println("Product of the two numbers is: " + calculateProduct(a, b));                 //function can be called inside an output
    }

     */



    /*public static void calculateFactorial(int n) {          //calculates the factorial of a number
        int factorial = 1;
        if(n<0) {
            System.out.println("Invalid input");
            return;
        }for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+ n + " is: " + factorial);
        //return;                                                             //return is not required as void is used
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer ");
        int m= scan.nextInt();
        calculateFactorial(m);
    }

     */



    /*public static void checkPrime(int n) {                            //check if a number is prime
        int flag=0;
        if(n<=1) {
            System.out.println("Not a prime number");
        }
        else {
            for(int i=2;i<=n/2;i++) {
                if(n%i ==0) {
                    System.out.println("Not a prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println("It is a prime number");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        checkPrime(n);
    }

     */




    /*public static void findEven(int n) {
        if(n % 2 ==0) {
            System.out.println(n + " is an even number");               //checks if a number is even or not
        } else {
            System.out.println(n + " is an odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        findEven(n);
    }

     */

    /*public static void printTable(int n) {                //prints the table of a number
        for(int i=1;i<=10;i++) {
            System.out.println(n*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n=sc.nextInt();
        printTable(n);
    }

     */

}