//sort collection names
package org.example;
import java.util.*;
public class CollectionSorting {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("Python", "Java","C++"));
        Collections.sort(names,(n1,n2)->n1.compareTo(n2));
        System.out.println("After Sorting = "+names);
    }
}
