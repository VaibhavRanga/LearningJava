package ApnaCollege;

import java.util.HashSet;

public class L18Recursion2 {

/*
    public static void towerOfHanoi(int n, String src, String help, String dest) {
        if(n == 1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, help);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);              //tower of Hanoi (O(2^n))
        towerOfHanoi(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        towerOfHanoi(5, "S", "H", "D");
    }

 */



    /*

    public static void printReverse(int idx, String str) {
        if(idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));                                      //reverse a string (O(n))-> where n is the length of string
        printReverse(idx-1, str);
    }

    public static void main(String[] args) {
        String str = "abcd";
        printReverse(str.length()-1, str);
    }

     */


    /*
    public static int first = -1;
    public static int last = -1;

    public static void findOccurrence(int idx, String str, char element) {
        if (idx == str.length()-1) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (str.charAt(idx) == element) {                       //find first and last occurrence of char 'a' in a string
            if (first == -1) {                                  // O(n)
                first = idx;
            }
            else {
                last = idx;
            }
        }
        findOccurrence(idx+1, str, element);
    }

    public static void main(String[] args) {
        findOccurrence(0, "abaacdaefaah", 'a');
    }

     */


    /*
    public static boolean checkSorted(int idx, int[] arr){
        if (idx == arr.length-1) {
            return true;
        }
        if (arr[idx] < arr[idx+1]) {
            return checkSorted(idx+1, arr);                             //checks whether an array is strictly sorted or not
        } else {                                                            // O(n)
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        if (checkSorted(0, arr)) {
            System.out.println("The array is strictly sorted");
        }
        else
            System.out.println("The array is not strictly sorted");
    }

     */


    /*
    public static void moveAllX(int idx, int count, String str, String newStr) {
        if (idx == str.length()) {
            for(int i=0; i<count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        if(str.charAt(idx) == 'x') {                                        //moves all 'x' in a string to the end; O(n)
            count++;
        } else {
            newStr += str.charAt(idx);
        }
        moveAllX(idx+1, count, str, newStr);
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(0, 0, str, "");
    }

     */


    /*
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(int idx, String str, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        if (! map[str.charAt(idx) - 'a']) {
            map[str.charAt(idx) - 'a'] = true;                          //removes duplicate elements in a string; O(n)
            newStr += str.charAt(idx);
        }
        removeDuplicates(idx+1, str, newStr);
    }

    public static void main(String[] args) {
        boolean[] map = new boolean[26];
        removeDuplicates(0,"abbccda", "");
    }

     */


    /*
    public static void subsequences(int idx, String str, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        subsequences(idx+1, str, newStr+str.charAt(idx));                       //prints subsequences of a string; O(2^n)
        subsequences(idx+1, str, newStr);
    }
    public static void main(String[] args) {
        subsequences(0, "abc", "");
    }

     */



    /*
    public static void subsequences(int idx, String str, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        subsequences(idx+1, str, newStr+str.charAt(idx), set);                      //prints unique subsequences of a string
        subsequences(idx+1, str, newStr, set);                                      //using HashSet
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        subsequences(0, "aaa", "", set);
    }

     */


    /*
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(int idx, String str, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        String map = keypad[str.charAt(idx) - '0'];
        for (int i=0; i<map.length(); i++) {
            printComb(idx+1, str, combination+map.charAt(i));                       //prints keypad combinations
        }
    }
    public static void main(String[] args) {
        printComb(0, "23", "");
    }

     */

}
