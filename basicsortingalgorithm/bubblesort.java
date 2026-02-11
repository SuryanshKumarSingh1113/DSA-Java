package basicsortingalgorithm;

public class bubblesort {
    public static void sort(int[] numbers){

        for(int iteration = 0; iteration<numbers.length-1;iteration++){   //outer loop to calculate turns/iterations
              for(int i = 0;i<numbers.length-1-iteration;i++){            
                if(numbers[i]>numbers[i+1]){
                    int temp = numbers[i+1];
                    numbers[i+1] = numbers[i];
                    numbers[i]=temp;
                }
              }
        }
     }
        public static void printarray(int[] numbers){                   //for printing the array
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]+" ");
        }
            System.out.println();
        }
    public static void main(String[] args) {
        int[] numbers = {45,50,32,10,68,69};
        sort(numbers);
        printarray(numbers);
        
       
    
    }
    
}
