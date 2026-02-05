package arrays;

public class maxsubarraysum2 {
    public static void By_Prefix_array(int[] numbers){
        int CurrentSum=0;
        int MaxSum = Integer.MIN_VALUE;

        int[] Prefixarray = new int[numbers.length];            //creating prefix array
        Prefixarray[0] = numbers[0];                            //0th index will be same

        for(int i =1;i<numbers.length;i++){                     //entering the elements of prefixarray
            Prefixarray[i] = Prefixarray[i-1] + numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start = i;

             for(int j=i;j<numbers.length;j++){
                int end = j;
                CurrentSum= start==0? Prefixarray[end]: Prefixarray[end] - Prefixarray[start -1]; //ternary operator
                
             }
             if (MaxSum < CurrentSum) {
                MaxSum = CurrentSum;
             }
        }
          System.out.println("maximum sum of subarray:" + MaxSum);
        }
    public static void main(String[] args){
      int[] numbers = {1,-2,6,-1,3};
      By_Prefix_array(numbers);
    }
}
