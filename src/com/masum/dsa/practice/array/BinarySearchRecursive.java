/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.masum.dsa.practice.array;
/**
 *
 * @author Masum
 */
public class BinarySearchRecursive {

    public static int recursivelySearch(int key, int l, int h, int[] arr) {
        if (l > h) {
            return -1;
        }
        
        int mid = (l + h) / 2;
        
        if (key == arr[mid]) {
            return mid;
        } else if (key > arr[mid]) {
            l = mid + 1;
        } else {
            h = mid - 1;
        }

        return recursivelySearch(key, l, h, arr);
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
        
        System.out.println(recursivelySearch(39, 0, arr.length, arr));
    }
}
