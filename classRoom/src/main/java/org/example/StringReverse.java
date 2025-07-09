package org.example;

@FunctionalInterface
interface StringReversal{
    String reverse(String n);
}
public class StringReverse {
    public static void main(String[] args) {
        StringReversal ref = (str)->{
            String result = "";
            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Reverse of the string is " + ref.reverse("welcome"));
    }
}
