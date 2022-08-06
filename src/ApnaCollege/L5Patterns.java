package ApnaCollege;

public class L5Patterns {

    public static void main(String[] args) {
        /*int m = 4;
        int n = 5;
        for (int i = 1; i <= m; i++) {         //prints a solid rectangle pattern
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */





        /*int m = 4;                            //prints a hollow rectangle pattern
        int n = 5;
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1 || j == 1 || i == m || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

         */



        /*int m = 4;
        for(int i = 1; i <=m; i++) {                    //half pyramid
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */





        /*int m = 4;
        for(int i = m; i >= 1; i--) {                   //inverted half pyramid
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=m;i++) {                         //another way of printing inverted half pyramid
            for(int j=1;j<=m-i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */



        /*int m = 4;                                  //another half pyramid; spaces first
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= m-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */


        /*int m = 4;
        for(int i = 1; i <= m; i++) {            //half pyramid with numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

         */



        /*int m = 4;
        for(int i = m; i >= 1; i--) {               //inverted half pyramid with numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

         */


        /*int m = 5;
        int num = 1;
        for(int i = 1; i <= m; i++) {               //Floyd's triangle
            for(int j =1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

         */



/*
        int m = 5;
        for(int i = 1; i <= m; i++) {               //1-0 triangle
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

 */

    }
}