package org.example;

public class RunnableExample {
    public static void main(String[] args) {
        //using lambda expression to implement runnable
        new Thread(()->System.out.println("New thread created")).start();
    }
}
