package strings_programs;

public class Largeststring {                                      
    public static void main(String[] args) {

        String[] fruits ={"apple","pineapple","mango","banana"};      //array of a string
        String largest = fruits[0];
        for(int i = 0;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){           
                largest = fruits[i];

            }
        }
        System.out.println(largest);
    }
    
}
//TC=O(x*N)   x is the