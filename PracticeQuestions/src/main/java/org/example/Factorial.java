package org.example;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();

        long ans=factorial(num);
        System.out.println(ans);
        print(num);
    }
    public static long factorial(int n){
        long fact=1;
        for(int i=2; i<=n ; i++){
            fact*=i;
        }
        return fact;
    }
    public static void print(int n){
        long fact=1;
        for(int i=0 ; i<=n;i++){
            if(i==0){
                fact=1;
            }else{
                fact*=i;
            }
            System.out.print(fact+" ");
        }
    }
}