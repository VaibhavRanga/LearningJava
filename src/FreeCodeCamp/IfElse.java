package FreeCodeCamp;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        //System.out.println(str);
        if (str == "hello") {
            System.out.println("You typed hello");
        }
        else {
            System.out.println("You didn't type hello");
        }

    }
}
