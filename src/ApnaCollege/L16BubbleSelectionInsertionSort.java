package ApnaCollege;

public class L16BubbleSelectionInsertionSort {

    public static void main(String[] args) {

        /*
        int arr[] = {7, 8, 3, 1, 2};
        for (int i=0;i<arr.length-1;i++) {
            for (int j=0;j<arr.length-i-1;j++) {        //bubble sort (ascending order); O(n^2)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

         */



        /*
        int arr[] = {7, 8, 3, 1, 2};
        for (int i=0;i< arr.length-1;i++) {
            int smallest = i;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[smallest] > arr[j]) {           //selection sort (ascending order); O(n^2)
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");

         */


/*
        int arr[] = {7, 8, 3, 1, 2};
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) {         //insertion sort (ascending order); O(n^2)
                //Keep swapping
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");


 */
    }
}
