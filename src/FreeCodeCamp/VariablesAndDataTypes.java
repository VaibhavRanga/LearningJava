package FreeCodeCamp;

public class VariablesAndDataTypes {
    public static void main(String[] args) {
        int num = 49;
        long num1 = 10L;
        float num2 = 45.5F;
        double num3 = 34.4;
        char d = 'j';
        boolean x = true;
        String str = "Mark";
        System.out.println(d);
        System.out.println(num1 / 3);   // int and long can't hold decimal values

        int a = 34;
        double b = 13.1; // at least one variable should be double to give double output
        double c = a * b;
        System.out.println(c);

        int p = 14;
        int q = 8;
        double r = p / (double)q;  // changing one of the variables from int to double to get output in double
        System.out.println(r);

        int s = a * p / q;
        System.out.println(s);

        double t = Math.pow(7, 5);
        System.out.println(t);

        double u = 56.5 % 5;             /* remainder operator; can be used as int and double */
        System.out.println(u);


    }
}
