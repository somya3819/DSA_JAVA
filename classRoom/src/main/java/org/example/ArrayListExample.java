package org.example;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Peter -> ");
        al.add("loves -> ");
        al.add("Somya");
        al.add(" hehe ");
        System.out.println(al);
        System.out.println("size of arraylist is "+al.size());

        System.out.println(al.contains("Somya"));//return true - "contains method" checks if that particular object is there in the arraylist or not
        System.out.println(al.contains("atharva bkl")); //return false
    }
}
