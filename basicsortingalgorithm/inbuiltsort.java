package basicsortingalgorithm;

import java.util.Arrays;
import java.util.Collections;       //descending order ke lie

public class inbuiltsort {
    public static void Printarray(int[] arrays){
        for(int i = 0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
    }
 
     public static void Printarray2(Integer[] arrays){         //Integer(object) use kie h
        for(Integer i = 0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        
         int[] arrays ={5,43,34,2,10};  
         Arrays.sort(arrays);                           //pura sort hoga
          Printarray(arrays);
          System.out.println();
          
         int[] arrays1={5,43,34,2,10};
         Arrays.sort(arrays1,0,3);   //starting ke 3 elements sort hoga remaining as it is
        Printarray(arrays1);
        System.out.println();

        // descending order ke lie
        Integer[] numbers={5,43,34,2,10};
        Arrays.sort(numbers,Collections.reverseOrder());           //Collections.reverseOrder works only with objects so that Integers
        Printarray2(numbers);
        System.out.println();

        Integer[] numbers2={5,43,34,2,10};
        Arrays.sort(numbers2,0,3,Collections.reverseOrder()); //starting 3 elements
        Printarray2(numbers);
    }
   

    
}
