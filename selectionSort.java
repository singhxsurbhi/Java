package com.company;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={12,56,-4,0,3,28};
        System.out.println("unsorted = " + Arrays.toString(arr));
        selectionsort(arr);
        System.out.println("sorted = " + Arrays.toString(arr));
    }
    static void selectionsort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            //find the maximum item in the remaining array and swap with correct index
            int last= arr.length-i-1;
            int maxIndex=getmaxindex(arr,0,last);
            swap(arr,maxIndex,last);
        }

    }


    static int getmaxindex(int[] arr,int start,int end){
        int max=start;
        for(int i=0;i<=end;i++){
            if(arr[start]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}
