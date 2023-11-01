package com.example.java8features.algorithm;

public class BinarySearch {

    public static int binarySearch(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (x == arr[mid]) return mid;
            if (x >= arr[mid]) low = low + 1;
            if (x <= arr[mid]) high = high - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {20, 34, 56, 100, 110};
        System.out.println(binarySearch(arr, 34));
    }
}
