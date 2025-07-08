package org.example;
@FunctionalInterface
interface Square{
    int calculate(int x);
}
public class FunctionalInterfaceAnnotation {
    public static void main(String[] args) {
        int a=3;

        //lambda expression to define the calculate method
        Square sq=(int x)-> x*x;

        //parameter passed and return type must be same as defined in the prototype
        int ans=sq.calculate(a);
        System.out.println("square of num is : "+ans);
    }
}
