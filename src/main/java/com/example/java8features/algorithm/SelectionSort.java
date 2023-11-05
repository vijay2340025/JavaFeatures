package com.example.java8features.algorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 7, 6};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (arr[j] <= arr[minIndex]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
