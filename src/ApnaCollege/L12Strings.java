package ApnaCollege;

import java.util.Scanner;

public class L12Strings {

    /*
    public static void main(String[] args) {

        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;       // concatenation

        System.out.println(fullName);
        System.out.println(fullName.length());

        for (int i=0;i<fullName.length();i++)
            System.out.println(fullName.charAt(i));         //charAt function: to print individual characters of a string

        String name1 = "Tony";
        String name2 = "Tony";

        //compareTo function

        //if string1 > string2 : +ve value
        //if s1 == s2: 0
        //if s1 < s2: -ve value will be returned by the compareTo function
        //e.g.
        //hello and wello      as w is greater than h it will return -ve value or s1 < s2
        //aawello and aahello  as w is gerater than h it will return +ve value or s1 > s2

        if (name1.compareTo(name2) == 0) {                      // conpareTo function compares two strings
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }



        if (name1.equals(name2))
            System.out.println("The strings are equal");        //equals function compares two strings
        else
            System.out.println("The strings are not equal");





        String fullName1 = "vaibhav ranga";
        String fullName2 = new String("Vaibhav ranga");             //equalsIgnoreCase function
        if (fullName1.equalsIgnoreCase(fullName2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");





        String sentence = "My name is Tony";
        String name = sentence.substring(11, sentence.length());        //substring function to get a part of string out of the whole string
        System.out.println(name);
        String name3 = sentence.substring(11);                          //end index is not required if used up to the last character
        System.out.println(name3);
        String sentence1 = "VaibhavRanga";
        String name4 = sentence1.substring(0, 7);                       //here we have used 7 as the end index instead of 6 so that
        System.out.println(name4);                                      //the full name could be copied


        String str = "123";
        int num = Integer.parseInt(str);                           //convert string to integer
        System.out.println(num);

        int num1 = 123;
        String str1 = Integer.toString(num1);                   //convert integer to string
        System.out.println(str1);
        System.out.println(str1.length());



    }

     */




    /*
    public static int lengthOfStringArray(int size) {
        String stringsArray[] = new String[size];
        int totalLength = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the items of array");
        for (int i=0;i<stringsArray.length;i++) {
            stringsArray[i] = scan.nextLine();
            totalLength += stringsArray[i].length();            //calculates sum of lengths of strings in an array
        }
        return totalLength;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        System.out.println("Length of strings in array is: " + lengthOfStringArray(size));
    }

     */

    /*
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String original = scan.next();
        String result = "";
        for (int j=0;j<original.length();j++) {          //replaces e with i
            if (original.charAt(j) == 'e')
                result += "i";
            else
                result += original.charAt(j);
        }
        System.out.println(result);
    }

     */


    /*

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email Id");
        String emailId = scan.next();
        String username = "";
        for (int i=0;i<emailId.length();i++) {                      //makes a username from an email id
            if (emailId.charAt(i) == '@')
                break;
            else
                username += emailId.charAt(i);
        }
        System.out.println("Your username is: " + username);
    }

     */
}
