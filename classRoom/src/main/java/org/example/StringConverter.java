package org.example;
import java.util.*;
import java.util.stream.Collectors;
public class StringConverter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java","C++","python","rust");
        List<String> upr_str = strings.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
        System.out.println("Uppercase Strings :" + upr_str);
    }
}
