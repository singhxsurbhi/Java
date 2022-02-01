package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner in= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter target element ");
        int target= in.nextInt();
        int ans= linearsearch(arr, target);
        System.out.println("target is present at index "+ans);

        //********
        //practice foreach and searchinrange tomorrow
        //********
    }
    static int linearsearch(int[] arr,int target ){
        if(arr.length==0){
            return -1;
        }
       for(int i=0;i<arr.length;i++){
           if(arr[i] == target ){
               return i;
           }
       }
       return -1;
    }
}
