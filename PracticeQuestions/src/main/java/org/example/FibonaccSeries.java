package org.example;
import java.util.*;
public class FibonaccSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
//        while(true){
//            if(num>=0){
//
//            }
//        }
        int nthFibbo=fibonacci(num);
        System.out.println("nthfibbo : "+nthFibbo);

        System.out.println("Series :");
        print(num);
    }
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        int a =0 , b=1 , sum=0;
        for(int i=2 ; i<n ;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
    public static void print(int n){
        int a =0 , b=1, sum=0 ;
        for(int i=0 ; i<n ;i++){
            if(i==0){
                System.out.print(a+" ");
            }else if(i==1){
                System.out.print(b+" ");
            }else{
                sum=a+b;
                System.out.print(sum+" ");
                a=b;
                b=sum;
            }
        }
        System.out.println();
    }
}
