package org.example;
interface TwoParameter{
    void add(int a , int b);
}
public class TwoParameterLambda {
    public static void main(String[] args) {
        TwoParameter tp=(a,b)-> System.out.println("sum is "+(a+b));
        tp.add(2,3);
    }
}
