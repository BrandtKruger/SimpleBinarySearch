package com.kruger.brandt;

public class Main {

    private static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }


    private  static void binarySearch( int n , int[] list){
        int found = binarySearch(list, 0, 0, n);

        if( found >= 0 ){
            System.out.println("Found Number: " + n);
        } else {
            System.out.println(n + " is not in the list.");
        }
    }

    public static void main(String[] args) {

        int[] list = new int[]{1, 2, 4, 5, 6, 8, 9, 13, 15, 17, 20, 21, 22, 24, 25, 26, 28, 29, 30};
        binarySearch(28, list);
    }
}
