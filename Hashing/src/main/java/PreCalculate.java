import java.util.*;
//FREQUENCY  COUNTER
public class PreCalculate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array :");
        int n=s.nextInt();

        //read the array elements
        int[] arr= new int[n];
        System.out.println("enter elements :");
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }

        //precompute frequencies using hashmap
        HashMap<Integer , Integer> map=new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0)+1);  //error handling - The getOrDefault() method safely handles numbers not present in the map.
        }

        //process queries
        System.out.println("enter no of queries :");
        int q=s.nextInt();

        while(q-- >0){
            System.out.println(" enter the no that u want to search : ");
            int number=s.nextInt();

            System.out.println(" frequency : "+ map.getOrDefault(number , 0));
        }
        s.close();
    }
}
