package ApnaCollege;

import java.util.Scanner;

public class L11TwoDArrays {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");              //inputs and prints a 2d array
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        System.out.println("Enter the array");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

     */


    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");              //inputs an array and finds the location of a number in the array
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        System.out.println("Enter the array");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number that you are looking for in array");
        int x = sc.nextInt();
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                if (x == numbers[i][j]) {
                    System.out.println("The number is at index: " + i + "," + j);
                    break;
                }
            }
        }
    }

     */



    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix");
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns in the matrix");        //spiral order matrix
        int cols = scan.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the array");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int rowStart = 0;
        int rowEnd = rows-1;
        int colStart= 0;
        int colEnd = cols-1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            //prints first row
            for (int i=colStart;i<=colEnd;i++)
                System.out.print(matrix[rowStart][i] + " ");
            rowStart++;
            //prints last column
            for (int i=rowStart;i<=rowEnd;i++)
                System.out.print(matrix[i][colEnd] + " ");
            colEnd--;
            //prints last row
            for (int i=colEnd;i>=colStart;i--)
                System.out.print(matrix[rowEnd][i] + " ");
            rowEnd--;
            //prints first column
            for (int i=rowEnd;i>=rowStart;i--)
                System.out.print(matrix[i][colStart] + " ");
            colStart++;
        }
    }

     */


    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the array");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the array");         //prints the transpose of a matrix
        int cols = sc.nextInt();
        int matrix[][]= new int[rows][cols];
        System.out.println("Enter the matrix");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int j=0;j<cols;j++) {
            for(int i=0;i<rows;i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

     */
}
