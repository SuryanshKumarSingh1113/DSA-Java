package arrays;
import java.util.*;
public class Largestelement {

public static int getlargest(int[] numbers){

    
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
        if(largest < numbers[i]){
            largest=numbers[i];
        }
    }

    int smallest = Integer.MAX_VALUE;      //its for smallest
    for(int i=0;i<numbers.length;i++){
        if (smallest > numbers[i]){
            smallest=numbers[i];
        }
    }

    System.out.println("the smallest number is:" + smallest);  //only one thing can be return so that for smallest we used sout 
    return largest;
}
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array: ");
    int size=sc.nextInt();
    System.out.println("Enter the elements of the array: ");
    int[] numbers = new int[size];
       for (int i=0;i<size;i++){
         numbers[i]=sc.nextInt();
       }
       System.out.println("The largest element of the array is:" + getlargest(numbers));
       sc.close();
   }
}
