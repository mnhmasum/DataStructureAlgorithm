package com.masum.dsa.practice.array;

/**
 *
 * @author Masum
 */
public class BinarySearch {

    public static int search(int key, int[] arr) {
        int l = 0;
        int h = arr.length;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = new int[16];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 6;
        arr[5] = 7;
        arr[6] = 12;
        arr[7] = 23;
        arr[8] = 25;
        arr[9] = 39;
        arr[10] = 40;
        arr[11] = 45;
        arr[12] = 56;
        arr[13] = 57;
        arr[14] = 58;
        arr[15] = 80;
        System.out.println(search(39, arr));
    }

}
