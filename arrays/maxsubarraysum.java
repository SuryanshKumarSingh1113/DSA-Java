package arrays;

public class maxsubarraysum {
    public static void max_sum_of_a_subarray(int[] numbers){
        int MaxSum = Integer.MIN_VALUE;
        int CurrentSum=0;

        for(int i=0;i<numbers.length;i++){
           int start = i;

           for(int j=i;j<numbers.length;j++){
            int end = j;

            CurrentSum=0;                               // it reset the currentsum by 0 for other subarray
            
            for(int k = start; k<=end ;k++){            //idhr start aur end ke beech ke elements ka sum print krwa rhe h
                CurrentSum += numbers[k];
            }
            System.out.println(CurrentSum);
             if(MaxSum < CurrentSum){
                MaxSum = CurrentSum;
             }
           }
      }
        System.out.println("The maximum sum of the subarray is = " + MaxSum);
    }
   public static void main (String[] args){
    int[] numbers = {1,-2,6,-1,3};
    max_sum_of_a_subarray(numbers);
   } 
}
