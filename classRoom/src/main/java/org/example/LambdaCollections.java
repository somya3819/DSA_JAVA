package org.example;
import java.util.*;
public class LambdaCollections {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>(Arrays.asList("Python", "Java","C++"));

        //printing
        names.forEach(name-> System.out.println(name));

        System.out.println();

        //upper case
        names.forEach(name-> System.out.println(name.toUpperCase()));

    }
}
