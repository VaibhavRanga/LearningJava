package ApnaCollege;

import java.util.Scanner;

public class L10Arrays {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[] marks = new int[3];                 //defining an array
        //int marks[] = new int[3];               //another way of defining an array

        int marks[] = {97, 95, 96};                 //another way of defining an array
        //marks[0] = 97;      //english: storing the value 97 to marks[0]
        //marks[1] = 95;      //physics
        //marks[2] = 96;      //chemistry


        //System.out.println(marks[1]);       //to print a single value stored in the marks array

        for (int i=0;i<3;i++)
            System.out.println(marks[i]);       //to print all the values of the array

        float numbers[] = new float[5];
        System.out.println("Enter five float values");
        for (int i=0;i<numbers.length;i++)
            numbers[i] = sc.nextFloat();

        for (int i=0;i<numbers.length;i++)
            System.out.println(numbers[i]);
    }

     */



    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the array values");
        for (int i=0;i<numbers.length;i++)
            numbers[i] = sc.nextInt();
        System.out.println("Enter the number to be searched in the array");     //linear search in an array
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i<numbers.length;i++) {
            if (numbers[i] == num) {
                System.out.println("Number found at index " + i);
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println("Number not found in the array");
    }

     */


    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");          //takes in names in an array and then prints them
        int size = sc.nextInt();
        String names[] = new String[size];
        System.out.println("Enter names");
        for (int i=0;i<size;i++) {
            names[i] = sc.next();
        }
        for (int i=0;i<names.length;i++) {
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }
    }

     */





    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");      //finds max and min number in an array
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the values of array");
        for (int i=0;i< numbers.length;i++) {
            numbers[i] = sc.nextInt();
        }
        int min=numbers[0];
        int max=numbers[0];
        for (int i=1;i<numbers.length;i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Smallest number is: " + min);
        System.out.println("Largest number is: " + max);
    }

     */


    /*
    public static void main(String[] args) {          //checks whether an array is sorted in ascending order
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter numbers of the array");
        for (int i=0;i<numbers.length;i++) {
            numbers[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for (int i=0;i<numbers.length-1;i++) {
            if (numbers[i] > numbers[i+1]) {
                isAscending= false;
                break;
            }
        }
        if (isAscending)
            System.out.println("The array is sorted in ascending order");
        else
            System.out.println("The array is not sorted in ascending order");
    }

     */
}
