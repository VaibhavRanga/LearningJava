package FreeCodeCamp;

import java.util.Scanner;

public class InputAndScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();     //to scan a string

        System.out.println(scanned);

        int scanned1 = sc.nextInt();    //to scan an integer, other data types can be scanned similarly
        System.out.println(scanned1);

        boolean scanned2 = sc.nextBoolean();
        System.out.println(scanned2);

        String scanned3 = sc.next();
        int x = Integer.parseInt(scanned3);     //converting string to integer
        System.out.println(x);

    }
}