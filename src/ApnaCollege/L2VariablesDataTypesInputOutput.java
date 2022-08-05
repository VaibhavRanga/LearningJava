package ApnaCollege;

import java.util.Scanner;

public class L2VariablesDataTypesInputOutput {
/*
    public static void main(String[] args) {
        byte number = 1;
        short number1 = 2;
        int num = 49;
        long num1 = 10;
        float num2 = 45.5F;
        double num3 = 34.4;
        char d = 'j';
        boolean x = true;
        final float PI = 3.14F;         //defining a constant by writing final
        String str = "Mark";

        System.out.println(d);

        System.out.println(num1 / 3);   //byte, short, int and long can't hold decimal values

        int a = 34;
        double b = 13.1; // at least one variable should be double to give double output
        double c = a * b;
        System.out.println(c);

        int p = 14;
        int q = 8;
        double r = p / (double) q;  // changing one of the variables from int to double to get output in double
        System.out.println(r);

        float s = (float) (a + p / q * b);      //actual answer differs from the output because a, p and q are integers
        System.out.println(s);

        double t = Math.pow(2, 1.5);
        System.out.println(t);

        double u = 56.5 % 5;             // remainder operator; can be used as int and double
        System.out.println(u);
    }

 */




    /*public static void main(String[] args) {
        System.out.print("Hello");          //output

        System.out.println("Hello");        //println goes to next line after printing

        System.out.print("Hello \n");       //another way of going to next line after printing
    }

     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //scanner (input)

        String scanned = sc.next();     //to scan a word of type string
        System.out.println(scanned);

        String str12345 = sc.nextLine();    //this line is used after sc.next()/ sc.nextInt, float etc functions so that
                                            // the next nextLine() could work properly

        String scanned4 = sc.nextLine();    //scans a whole line of type string
        System.out.println(scanned4);

        int scanned1 = sc.nextInt();    //to scan an integer, other data types can be scanned similarly e.g. nextFloat
        System.out.println(scanned1);

        boolean scanned2 = sc.nextBoolean();
        System.out.println(scanned2);

        String scanned3 = sc.next();
        int x = Integer.parseInt(scanned3);     //converting string to integer; only numbers can be converted using this method
        System.out.println(x);
    }


}