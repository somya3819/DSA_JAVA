package org.example;

interface OneParameter{
    void display(String str);
}
public class OneParameterLambda{
    public static void main(String[] args){
        OneParameter op=(name)->System.out.println("Hello " + name);
        op.display("Somya");

    }
}
