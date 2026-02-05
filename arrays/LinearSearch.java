package arrays;
import java.util.*;
public class LinearSearch {
    public static int Search(int[] numbers, int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
            return -1;
        
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] numbers=new int[size];
        
        for (int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int result=Search(numbers,key);
        if(result==-1){
            System.out.println("Not found");
    }else{
        System.out.println("Found at index:"+result);
    }
     sc.close();
 }

}