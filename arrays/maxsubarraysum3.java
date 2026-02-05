package arrays;

public class maxsubarraysum3 {

    public static void kadanesalgorithm(int[] numbers){
        int CurrentSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for (int i= 0; i< numbers.length; i++) {
            CurrentSum=CurrentSum + numbers[i];
                if (CurrentSum<0) {
                    CurrentSum= 0;
                }
                MaxSum= Math.max(CurrentSum, MaxSum);
            }
            System.out.println("max sum of subarray is:" + MaxSum);
        }
         public static void main(String[] args) {
         int[] numbers ={-2,-3,4,-1,-2,1,5,-3};   
         kadanesalgorithm(numbers);
    }
    
}


