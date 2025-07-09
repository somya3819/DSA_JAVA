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

//import java.util.*;
//public class CollectionSorting {
//    public static void main(String[] args) {
//        //TODO Auto-generated method stub
//        List<String> names = Arrays.asList("Python","Java","React","C","Selenium");
//        names.sort((n1,n2)->n2.compareTo(n1));
//        System.out.println("After Sorting " + names);
//    }
//}
