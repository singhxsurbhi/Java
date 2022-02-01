package com.company;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={2,180,7,3,-67,14};
        System.out.println("Unsorted array is " +Arrays.toString(arr));
        bubble(arr);
        System.out.print("Sorted array is ");
        System.out.print(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        int n=arr.length-1;
        boolean swapped;
        swapped=false;
        for(int i=0;i<n;i++) {
            for(int j=1;j<=n-i;j++){
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}



