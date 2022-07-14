package ApnaCollege;

import java.util.Scanner;

public class L3IfElseAndSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        /*System.out.println("Enter your age");       //to check whether a person is an adult or not
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are not an adult");
        }

         */


        /*
        System.out.println("Enter a number");       //checks whether a number is even or odd

        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("It is an even number");
        }
        else {
            System.out.println("It is an odd number");
        }
        */

        /*
        System.out.println("Enter the value of number a");      //checks whether a number is equal or greater or smaller than other number
        int a = sc.nextInt();
        System.out.println("Enter the value of number b");
        int b = sc.nextInt();
        if(a == b) {
            System.out.println("Equal");
        }
        else if(a > b) {
            System.out.println("a is greater");
        }
        else if(a < b)
            System.out.println("a is smaller");      //without curly brackets in if/ else if / else, only the next line will get executed as condition result
        */

        /*
        System.out.println("Enter 1/ 2/ 3");        //prints different greetings
        int x = sc.nextInt();
        if(x == 1)
            System.out.println("Hello");
        else if(x == 2)
            System.out.println("Namaste");
        else if(x == 3)
            System.out.println("Bonjour");
        */

        /*System.out.println("Enter 1/ 2/ 3");        //switch example
        int x = sc.nextInt();
        switch(x) {
            case 1 :
                System.out.println("Hello");
                System.out.println("Vaibhav");
                break;
            case 2 :
                System.out.println("Namaste");
                break;
            case 3 :
                System.out.println("Bonjour");
                break;
            default :
                System.out.println("Invalid input");
        }

         */

        /*System.out.println("Enter a number");                 //calculator using switch
        float a = sc.nextFloat();
        System.out.println("Enter another number");
        float b = sc.nextFloat();
        System.out.println("Enter operator e.g. +, -, *, /, %");
        String operator = sc.next();
        switch(operator) {
            case "+" :
                System.out.println(a + b);
                break;
            case "-" :
                System.out.println(a - b);
                break;
            case "*" :
                System.out.println(a * b);
                break;
            case "/" :
                System.out.println(a / b);
                break;
            case "%" :
                System.out.println(a % b);
                break;
            default :
                System.out.println("Invalid input");
        }
        */
    }
}
