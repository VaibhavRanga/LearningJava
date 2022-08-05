package ApnaCollege;

import java.util.Scanner;

public class L4Loops {
    //public static void main(String[] args) {
        /*for(int counter = 0; counter < 3; counter = counter + 1) {          //for loop
            System.out.println("Hello world!");
        }
         */

        /*for(int i = 0; i < 11; i++) {       //simpler version of for loop
            System.out.println(i);
        }

         */


        /*int i = 0;
        while(i < 11) {                         //while loop
            System.out.println(i);
            i++;
        }
        */

        /*int i = 0;                              //do while loop
        do {
            System.out.println(i);
            i++;
        } while(i < 11);

         */


        /*Scanner sc = new Scanner(System.in);            //prints the sum of first n natural numbers
        System.out.println("Enter a natural number");
        int x = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= x; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of first " + x + " natural numbers is " + sum);

         */

        /*Scanner sc = new Scanner(System.in);            //prints table of a natural number
        System.out.println("Enter a natural number");
        int x = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(x * i);
        }

         */

        /*Scanner sc = new Scanner(System.in);                //prints the even numbers up to a natural number
        System.out.println("Enter a natural number");
        int x = sc.nextInt();

        for(int i = 2; i <= x; i += 2) {
            System.out.println(i);
        }*/



    /*
        public static void Reply() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter choice (1 to continue)/ (0 to exit)");        //menu driven program as per question 3
            int choice = scan.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    System.out.println("Enter marks out of 100");
                    int marks = scan.nextInt();
                    if (marks >= 90)
                        System.out.println("This is Good");
                    else if (marks >=60 && marks <= 89)
                        System.out.println("This is also Good");
                    else if (marks >=0 && marks <= 59)
                        System.out.println("This is Good as well");
                    Reply();
                    break;
                default :
                    System.out.println("Invalid input");
            }
        }

        public static void main (String[] args) {

            Reply();
        }

     */


    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to continue or 0 to exit");     //another solution for menu driven program as per question 3
        int num = sc.nextInt();

        while (num == 1) {
            System.out.println("Enter marks out of 100");
            int marks = sc.nextInt();
            if (marks >= 90)
                System.out.println("This is good");
            else if (marks >= 60 & marks <= 89)
                System.out.println("This is also good");
            else if (marks >= 0 & marks <= 59)
                System.out.println("This is good as well");
            System.out.println("Enter 1 to continue or 0 to exit");
            num = sc.nextInt();
            if (num == 0)
                break;
            else if (num != 1 & num != 0)
                System.out.println("Invalid input");
        }
    }

     */



        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num = scan.nextInt();
        boolean isPrime = true;
        if (num == 1)
            System.out.println("It is neither composite nor prime number");             //checks whether a number is prime or not
        else if (num < 1)
            System.out.println("Invalid number");
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.println("It is a prime number");
            else
                System.out.println("It is not a prime number");
        }

         */

    //}
}
