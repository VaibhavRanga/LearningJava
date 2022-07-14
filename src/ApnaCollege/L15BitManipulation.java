package ApnaCollege;

import java.util.Scanner;

public class L15BitManipulation {
    public static void main(String[] args) {
        //get   : to get a bit
        //set   : to set a bit to 1
        //clear : to set a bit to 0
        //update: to complement a bit   : to update the bit to 1 we do the set operation and to change to 0 we do the clear operation

        /*

        // get the 3rd bit (position 2) of a number n = 5 (0101 in binary)

        // to get a bit:
        // bit mask 1 << i (i = position of bit in the binary value) will be created
        // then bitwise AND (&) will be performed between bit mask and number n

        int n=5;        // binary value of 5 is 0101
        int pos = 2;
        int bitMask = 1<<pos;

        if ((bitMask & n) == 0)
            System.out.println("the bit is 0");
        else
            System.out.println("the bit is 1");

         */

        /*

        //set the 2nd bit (position = 1) of a number n = 5 (0101 in binary)

        //to set a bit:
        //bit mask 1 << i (i = position of bit in the binary value)
        //bitwise OR operation will be performed between bit mask and the number n

        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);

         */

        /*

        //clear the 3rd bit (position 2) of a number n =5 (0101 in binary)

        // to clear a bit:
        //bit mask will be      1<<i
        // perform bitwise NOT operation on bit mask
        // perform AND operation on not (~)bit mask and number n

        int n =5;
        int pos = 2;
        int bitMask = 1<< pos;
        int notBitMask = ~ bitMask;
        int newNumber = notBitMask & n;
        System.out.println(newNumber);

         */


        /*
        System.out.println("Enter a number");               //Write a program to toggle a bit a position = “pos” in a number “n”.
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter the position at which the bit has to be toggled");
        int pos = scan.nextInt();
        int bitMask = 1<<pos;
        int notBitMask = ~ (bitMask);
        int newNumber = 0;
        if ((bitMask & n) == 0)
            newNumber = bitMask | n;
        else
            newNumber = notBitMask & n;
        System.out.println(newNumber);

         */


        /*
        // Entered number to be converted into binary
        int num = 45;
        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;
        int ones = 0;
        // Number should be positive
        while (num > 0) {
            binary[id++] = num % 2;                 //converts decimal to binary and also counts ones in the binary
            if (num %2 == 1)
                ones +=1;
            num = num / 2;
        }
        // Iteration over array
        for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
        System.out.println();
        System.out.println("There are " + ones + " ones in the binary number");

         */

    }
}