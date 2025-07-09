package org.example;
import java.util.*;
        import java.util.stream.Collectors;
public class FilterMapExample {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        //These are marks of the students
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);
        System.out.println("Marks of students before grace :" + marks);
        //Now we want to grace marks of 5
        List<Integer> updatedMarks = marks.stream().map(i->i+5).collect(Collectors.toList());
        //Printing the marks of the students after grace
        System.out.println("Marks of students after grace :" + updatedMarks);
    }
}
