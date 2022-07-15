package com.company;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //insert elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //will not be added because only unique elements can be added to set

        System.out.println(set);

        //contains
        if(set.contains(1)){
            System.out.println("set contains one");
        }
        if(!set.contains(6)){
            System.out.println("set does not contain the number");
        }

        //to delete any element- remove
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("set does not contain the number, it has been deleted ");
        }

        //size
        System.out.println(set.size());

        set.add(4);
        set.add(15);
        set.add(12);

        //Iterator    2 main functions( hasnext() and next() )
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());       // not necessarily in sorted way or any specific order
        }
        System.out.println(set);

    }
}
