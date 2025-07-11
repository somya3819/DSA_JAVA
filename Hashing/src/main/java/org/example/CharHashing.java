package org.example;
import java.util.*;
public class CharHashing {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        //read input string
        System.out.println("enter string");
        String str=s.next();

        //precomputing character frequencies
        int[] hash=new int[256];
        for(int i=0 ; i<str.length() ; i++){
            char c=str.charAt(i);
            hash[c]++;
        }

        //reading no of queries
        System.out.println("enetr no of queries : ");
        int q=s.nextInt();

        while(q-- >0){
            System.out.println(" char to search : ");
            char c=s.next().charAt(0);
            System.out.println("frequency = "+hash[c]);
        }
        s.close();
    }
}
