package ApnaCollege;
import java.util.Scanner;

public class L8Exercise1 {
    /*public static void calculateAverage(int a, int b, int c) {
        System.out.println("Average of the numbers is: "+ (a+b+c)/3);           //calculates average of three numbers
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        calculateAverage(a, b, c);
    }

     */

    /*public static void calculateSum(int m) {              //sum of first n odd numbers
        int sum = 0;
        for(int i=1;i<=m;i++) {
            if(i%2 != 0) {
                sum=sum+i;
            }
        }
        System.out.println("Sum of odd numbers up to " +m+ " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int m = sc.nextInt();
        calculateSum(m);
    }

     */


/*
    public static int findGreater(int a, int b) {             //prints greater of two numbers
        if(a>b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int greater = findGreater(a, b);
        System.out.println(greater + " is greater");
    }

 */



    /*public static float calculateCircumference(float r) {                 //prints circumference
        return 2* 3.14F * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        float r = sc.nextFloat();
        System.out.println("Circumference is: " + calculateCircumference(r));
    }

     */



    /*public static boolean eligibleToVote(int age) {               //checks whether a person can vote or not
        if(age>18)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println(eligibleToVote(age));
    }

     */





    /*public static void main(String[] args) {
        int m=2;
        do {
            int i=1;
            System.out.println(i);                          //an infinite loop
        } while(m>1);
    }

     */


    /*public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");          //positive, negative and zeros counter
        int m = sc.nextInt();
        int positive =0, negative=0, zero=0;
        for(int i=1;i<=m;i++) {
            System.out.println("Enter number");
            int buffer = sc.nextInt();
            if(buffer<0)
                negative++;
            else if(buffer>0)
                positive++;
            else
                zero++;
        }
        System.out.println("Positive numbers: " + positive + "\n" + "Negative numbers: " + negative + "\n" + "Zeros: " + zero);
    }

     */



    /*public static void power(float base, double exponent) {
        float pow = 1;
        for(int i=1;i<=exponent;i++) {
            pow = pow * base;
        }
        System.out.println(pow);                                //power calculator
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        float base= sc.nextFloat();
        System.out.println("Enter the exponent");
        double exponent= sc.nextDouble();
        power(base, exponent);
    }

     */



    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        float base = sc.nextFloat();
        System.out.println("Enter exponent");
        float exponent = sc.nextFloat();
        double power = Math.pow(base, exponent);                    //power calculator using Math.pow function
        System.out.println(power);
    }

     */


    /*public static void GCD(int num1, int num2) {              //gcd / hcf calculator
        if (num1 == 0)
            System.out.println(num2);
        else if (num2 == 0)
            System.out.println(num1);
        else {
            while (num1 != num2) {
                if (num1 > num2)
                    num1 -= num2;
                else
                    num2 -= num1;
            }
            System.out.println(num2);
        }
    }
    public static void main(String[] args) {
        GCD(0, 0);
    }

     */



    /*public static void printFibonacci(int numberOfTerms) {
        int num1=0, num2=1, num3=0;                                                   //prints fibonacci series
        for (int i=0;i<numberOfTerms;i++) {
            System.out.print(num1 + " ");
            num3 = num1+num2;
            num1=num2;
            num2=num3;
        }
    }

    public static void main(String[] args) {
        printFibonacci(10);
    }

     */
}
