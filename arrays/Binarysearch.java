package arrays;
import java.util.*;     // no use
public class Binarysearch {

public static int binarysearch(int[] numbers,int key){
    int start=0;int end=numbers.length-1;

    while (start <= end) {          //start is always less or equal to end
        int mid=(start+end)/2;       

           //compariosns   
           if (numbers [mid] == key) {
            return mid;
           }

           if(numbers[mid]<key){                 //searches in the right part
                start=mid+1;
           }else{
            end=mid-1;                          //left part
           }
}
     return -1;   //key not found
}
public static void main (String[] args){
    int[] numbers = {10,20,30,40,50};
    int key=20;
    System.out.println("key found at index: " + binarysearch(numbers,key));
} 
}