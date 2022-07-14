package ApnaCollege;

public class L5L6Patterns {
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



        /*int m = 5;
        for(int i = 1; i <= m; i++) {               //1-0 triangle
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else
                    System.out.print("0 ");
            }
            System.out.println();
        }

         */




        /*int m = 4;
        for(int i = 1; i <= m; i++) {               //solid butterfly pattern
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= (2*(m-i));j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = m; i >= 1; i--) {
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= (2*(m-i)); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */


        /*

        int m=4;
        for(int i=1;i<=m-1;i++) {               //another solid butterfly pattern
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(int j=1;j<=2*(m-i);j++) {
                System.out.print(" ");
            }
            System.out.print("\b");
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=m;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(int j=1;j<=2*(m-i);j++) {
                System.out.print(" ");
            }
            System.out.print("\b");
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */





        /*int m = 5;
        for(int i = m; i >= 1; i--) {           //solid rhombus
            for(int j=i-1;j >=1;j--) {
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */


/*
        int m=1;                            //another solid rhombus
        for(int i = 1; i <=5;i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i<= 4; i++) {
            for(int j = 1; j <= m; j++) {
                System.out.print(" ");
            }
            m++;
            for(int j = 1; j <=5;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

 */





        /*int m = 5;
        for(int i=1; i<=m;i++) {                //number pyramid
            for(int j=1;j<=m-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

         */


/*
        int m=5;
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=m-i;j++) {               //palindromic number pattern
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }

 */



        /*
        int m=4;
        for(int i=1; i<=m;i++) {                //diamond pattern
            for(int j=1;j<=m-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=m; i>=1;i--) {
            for(int j=1;j<=m-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */


/*
        int n = 4;
        for (int i=1;i<=n-1;i++) {              //another diamond pattern
            for (int j=1;j<=n-i;j++)
                System.out.print(" ");
            for (int j=i;j>=1;j--)
                System.out.print("*");
            for (int j=2;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i=n;i>=1;i--) {
            for (int j=1;j<=n-i;j++)
                System.out.print(" ");
            for (int j=i;j>=1;j--)
                System.out.print("*");
            for (int j=2;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }

 */


/*
        int n = 5;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                if (j==1 || i==j)
                    System.out.print("*");              //hollow butterfly pattern
                else
                    System.out.print(" ");
            }
            for (int j=1;j<=2*(n-i);j++)
                System.out.print(" ");
            for (int j=1;j<=i;j++)
                if (j==1 || i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        for (int i=n;i>=1;i--) {
            for (int j=1;j<=i;j++) {
                if (j==1 || i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j=1;j<=2*(n-i);j++)
                System.out.print(" ");
            for (int j=1;j<=i;j++)
                if (j==1 || i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }

 */


        /*int n=5;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n-i;j++)
                System.out.print(" ");
            for (int j=1;j<=n;j++) {
                if (i==1 || i==n || j==1 || j==n)           //hollow rhombus
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

         */



        /*int n=5;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++)
                System.out.print(j + " ");                          //question 4
            System.out.println();
        }

         */


        /*int n=5;
        for (int i=1;i<=n;i++) {                                           //also question 4
            for (int j=1;j<=n-i;j++)
                System.out.print(" ");      //prints spaces
            for (int j=1;j<=i;j++)
                System.out.print(j + " ");  //prints stars after spaces
            System.out.println();
        }

         */


        /*int n=5;
        int num=1;
        for (int i=n;i>=1;i--) {                        //question 5
            for (int j=1;j<=i;j++)
                System.out.print(num + " ");
            num++;
            System.out.println();
        }

         */


        /*int n=5;
        int num=1;
        for (int i=n;i>=1;i--) {
            for (int j=1;j<=n-i;j++)
                System.out.print(" ");
            for (int j=1;j<=i;j++)
                System.out.print(num + " ");            //also question 5
            num++;
            System.out.println();
        }

         */
    }
}