package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class string_and_stringBuilder {
    public static void main(String[] args) {

        //  ------- String --------

        Scanner sc= new Scanner(System.in);
        String myname= sc.next();
        System.out.println("My name is "+ myname);
        String Fullname= sc.nextLine(); //nextLine for full sentence
        System.out.println("hello, I am "+ Fullname);

        //concatenation
        String firstname="Tony";
        String lastname="Stark";
        String fullname= firstname + "@" + lastname;
        System.out.println(fullname);

        System.out.println(fullname.length()); //gives length of string

        //charAt() used to access char at given index
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

        //compare
        String name1= new String("Surbhi");
        String name2= new String("Surbhi");
        System.out.println(name1.equals(name2)); // returns true if value of strings are same
        System.out.println(name1==name2);  // checks value of string as well as object(pointer)
        System.out.println(name1.compareTo(name2));   //returns 0 if value of strings are equal, some positive number if name1>name2 and negative number if name1<name2

        //substring
        String sentence = "I am learning Strings";
        String sub= sentence.substring(0,14);
        String sub2 = sentence.substring(14 ); //by default takes substring from index mentioned till last char
        System.out.println(sub);
        System.out.println(sub2);
        //    ** Strings are immutable **

        //        ------- StringBuilder -------
        
        StringBuilder sb= new StringBuilder("Surbhi");
        System.out.println(sb);

        //charAt()
        System.out.println(sb.charAt(5));

        //set charAt(index,char)
        sb.setCharAt(3,'k');
        System.out.println(sb);
        sb.setCharAt(3,'b');

        //insert(index,char)
        sb.insert(6,'S');
        System.out.println(sb);

        //delete(index1, index2) deletes characters from index1 till index2 (index2 not included)
        sb.delete(3,5);
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);

        //append i.e. to add new characters or strings
        StringBuilder s = new StringBuilder("H");
        s.append('r');
        s.append("str");
        System.out.println(s);

        //length
        System.out.println(s.length());

    }
}
