package com.company;

import java.util.*;


public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>();

        //List.add(x) adds x to the List
        List1.add(0);
        List1.add(2);
        List1.add(3);

        System.out.println(List1);

        //List.add(a,b) is used to add element b at the index a
        List1.add(1,1);

        System.out.println(List1);

        //List1.set(a,b) replaces the element at index a with'b'
        List1.set(0,5);
        System.out.println(List1);

        // List.get(i) is used to access the element present at index i of the List
        System.out.println(List1.get(2));

        // .remove(i) removes the element at index i
        List1.remove(2);
        System.out.println(List1);

        //size of arraylist
        System.out.println(List1.size());

        //loops
        System.out.println("elements in the list are:");
        for (int i = 0; i < List1.size(); i++) {
            System.out.print(List1.get(i));
        }

        //sorting
        Collections.sort(List1);
        System.out.println(List1);
    }
}
