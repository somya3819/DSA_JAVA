package org.example;
import java.util.*;
public class SumOfMul {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
int num=s.nextInt();
int sum=0;
if(num<0){
    System.out.println("Invalid");
}
for(int i=1 ; i<=num ;i++){
    if(i%6==0 || i%10==0 ){
        sum+=i;
    }
}
        System.out.print(sum);
    }
}
