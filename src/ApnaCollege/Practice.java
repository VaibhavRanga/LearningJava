package ApnaCollege;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //scanner (input)

        System.out.println("Enter your first name");
        String scanned = sc.next();     //to scan a word of type string
        System.out.print(scanned);

        System.out.println("Enter your full name");
        String scanned4 = sc.nextLine();    //scans a whole line of type string
        System.out.println(scanned4);

        System.out.println("Enter an integer");
        int scanned1 = sc.nextInt();    //to scan an integer, other data types can be scanned similarly e.g. nextFloat
        System.out.println(scanned1);

        System.out.println("Enter a boolean value (true or false");
        boolean scanned2 = sc.nextBoolean();
        System.out.println(scanned2);

        System.out.println("Enter an integer");
        String scanned3 = sc.next();
        int x = Integer.parseInt(scanned3);     //converting string to integer; only numbers can be converted using this method
        System.out.println(x);
    }
}