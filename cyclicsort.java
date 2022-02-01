package com.company;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr={2,4,5,3,1,8,9,7,6,19};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            while(arr[i] != i + 1) {
                    swap(arr, i, arr[i] - 1);
                }
            }
        }

    static void swap(int[] arr, int first, int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}
