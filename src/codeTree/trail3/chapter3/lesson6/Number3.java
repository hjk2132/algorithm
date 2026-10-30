package codeTree.trail3.chapter3.lesson6;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-implement-merge-sort/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int[] mergedArr = new int[n];
        mergeSort(arr, 0, n - 1, mergedArr);

        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int low, int high, int[] mergedArr) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid, mergedArr);
            mergeSort(arr, mid + 1, high, mergedArr);
            merge(arr, low, mid, high, mergedArr);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high, int[] mergedArr) {
        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                mergedArr[k++] = arr[i++];
            } else {
                mergedArr[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            mergedArr[k++] = arr[i++];
        }

        while (j <= high) {
            mergedArr[k++] = arr[j++];
        }

        for (int l = low; l <= high; ++l) {
            arr[l] = mergedArr[l];
        }
    }
}
