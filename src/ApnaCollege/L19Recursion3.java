package ApnaCollege;

import java.util.*;

public class L19Recursion3 {

    /*public static void printPermutations(String str, String permutation) {
        if(str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            String newString = str.substring(0, i) + str.substring(i+1);            //prints permutations of a string; O(n!)
            printPermutations(newString, permutation+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        printPermutations("abc", "");
    }*/




    /*public static int countPaths(int i, int j, int m, int n) {
        if(i == m || j == n) {
            return 0;
        }
        if(i == m-1 && j == n-1) {
            return 1;
        }
        int downPaths = countPaths(i+1, j, m, n);                       //counts paths in a matrix from start to end
        int rightPaths = countPaths(i, j+1, m, n);
        return downPaths + rightPaths;
    }
    public static void main(String[] args) {
        int m=3, n=3;
        System.out.println(countPaths(0, 0, m, n));
    }*/




/*
    public static int placeTiles(int n, int m) {
        if(n == m) {
            return 2;
        }
        if(n < m) {
            return 1;
        }
        int placeVertical = placeTiles(n-m, m);                     //counts total ways of placing tiles on a floor
        int placeHorizontal = placeTiles(n-1, m);
        return placeVertical + placeHorizontal;
    }
    public static void main(String[] args) {
        int n=4, m=2;
        System.out.println(placeTiles(n, m));
    }

 */


/*
    public static int callGuests(int n) {
        if(n <= 1) {
            return 1;
        }
        int ways1 = callGuests(n-1);
        int ways2 = (n-1) * callGuests(n-2);                    //prints the number of ways guests can be called
        return ways1 + ways2;
    }

    public static void main(String[] args) {
        System.out.println(callGuests(4));
    }

 */


/*
    public static void printSubset(ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset) {                  //prints subsets of numbers up to a number n; O(2^n)
        if (n == 0) {
            printSubset(subset);
            return;
        }
        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size() - 1);
        findSubsets(n-1, subset);
    }

    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }

 */


}
