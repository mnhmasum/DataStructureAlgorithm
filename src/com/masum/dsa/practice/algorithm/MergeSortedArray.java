package com.masum.dsa.practice.algorithm;

import java.util.Arrays;

/**
 *
 * @author Masum
 */
public class MergeSortedArray {

    private static int[] mergeArray(int[] A1, int[] A2) {
        int[] arr = new int[A1.length + A2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < A1.length && j < A2.length) {
            if (A1[i] < A2[j]) {
                arr[k++] = A1[i++];
            } else {
                arr[k++] = A2[j++];
            }
        }

        if (i < A1.length) {
            for (int l = i; l < A1.length; l++) {
                arr[k++] = A1[l];
            }
        }

        if (j < A2.length) {
            for (int l = j; l < A2.length; l++) {
                arr[k++] = A2[l];
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int a[] = {7, 8, 9};
        int[] b = {1, 5, 6, 6, 6};
        int[] result = mergeArray(a, b);
        System.out.println(Arrays.toString(result));
    }
}
