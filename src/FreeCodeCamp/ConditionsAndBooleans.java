package FreeCodeCamp;

public class ConditionsAndBooleans {
    public static void main(String[] args) {
        int x = 6;
        int y = 23;
        int z = 10;
        boolean compare = x != y;       // ==, <, >, <=, >=, != operators can be used with numbers
        System.out.println(compare);

        String a = "hello";
        String b = "hi";

        boolean compare1 = a == b;      //only == and != operators can be used with strings
        System.out.println(compare1);

        boolean compare2 = x < y && y > z;      // and operator; returns true only when both comparisons return true
        System.out.println(compare2);

        boolean compare3 = x < y || y < z;      // or operator; returns true when at least one comparison returns true
        System.out.println(compare3);

        boolean compare4 = !(x < y || y < z);   // not operator; returns true when the comparison is false and vice versa
        System.out.println(compare4);

        boolean compare5 = (x > y != y < z) || (x + 2 == y || z - 1 > 4);    //multiple comparisons can be done together
        System.out.println(compare5);

    }
}
