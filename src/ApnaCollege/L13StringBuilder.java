package ApnaCollege;

import java.util.Scanner;

public class L13StringBuilder {

//    public static void main(String[] args) {

        /*

        StringBuilder sb = new StringBuilder("Tony");               //string builder is faster than string as it modifies at the same memory location
        System.out.println(sb);                                     //while in string a new memory location is used on each modification

        //access/ print char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'P');           //modifies the char at an index
        System.out.println(sb);

        //insert a char/ string/ int etc. anywhere in a string
        sb.insert(0, 'S');
        System.out.println(sb);
        sb.insert(3, 'n');
        System.out.println(sb);

        //delete multiple characters
        sb.delete(0, 1);
        System.out.println(sb);

        //delete a single char
        sb.deleteCharAt(2);
        System.out.println(sb);

        // append to a string builder
        sb.append("yy");
        System.out.println(sb);

        //length of the string
        System.out.println(sb.length());


        */


    /*
    public static void reverse(StringBuilder sb) {
        StringBuilder result = new StringBuilder("");               //reverse a string
        for (int i=sb.length()-1; i>=0; i--) {
            result.append(sb.charAt(i));
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuilder sb = new StringBuilder(sc.next());
        reverse(sb);
    }

     */


/*
    public static void reverse(StringBuilder sb) {
        for (int i=0; i<sb.length()/2; i++) {
            int front = i;
            int end = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char endChar = sb.charAt(end);

            sb.setCharAt(front, endChar);                             // another method to reverse a string
            sb.setCharAt(end, frontChar);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuilder sb = new StringBuilder(sc.next());
        reverse(sb);
    }


 */


        /*

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        StringBuilder[] sb = new StringBuilder[size];
        int totalLength = 0;
        System.out.println("Enter the array elements");             //calculates sum of lengths of strings in an array
        for (int i=0; i<sb.length; i++) {
            sb[i] = new StringBuilder(sc.next());
            totalLength += sb[i].length();
        }
        System.out.println(totalLength);


        */



        /*
        public static void lengthOfStringsInArray(StringBuilder sb[]){
            int totalLength = 0;
            for (int i=0; i<sb.length; i++) {
                totalLength += sb[i].length();
            }
            System.out.println(totalLength);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");                      //calculates sum of lengths of strings in an array using a function
            int size = sc.nextInt();
            StringBuilder[] sb = new StringBuilder[size];
            System.out.println("Enter the array elements");
            for (int i=0; i<sb.length; i++)
                sb[i] = new StringBuilder(sc.next());
            lengthOfStringsInArray(sb);
        }

         */


        /*
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string");
            StringBuilder sb = new StringBuilder(sc.next());                //replaces e with i in a StringBuilder
            StringBuilder result = new StringBuilder("");
            for (int i=0; i<sb.length(); i++) {
                if (sb.charAt(i) == 'e')
                    result.append('i');
                else
                    result.append(sb.charAt(i));
            }
            System.out.println(result);
        }

         */



    /*
    public static void username(StringBuilder sb) {
        StringBuilder userName = new StringBuilder("");
        for (int i=0; i<sb.length(); i++) {
            if (sb.charAt(i) == '@') {
                break;
            }
            else
                userName.append(sb.charAt(i));                      //prints a username out of an email id
        }
        System.out.println(userName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an email id");
        StringBuilder sb = new StringBuilder(sc.next());
        username(sb);
    }

     */


    }
//}