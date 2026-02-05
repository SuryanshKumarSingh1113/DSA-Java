package arrays;

public class subarray {
    public static void printsubarray(int[] numbers){
        int totalsubarray=0;                          //to find total subarray

        for(int i =0;i<numbers.length;i++){           //for start
            int start = i;

            for(int j= i;j<numbers.length;j++){        //j=i kyuki i ko bhi print krna h else j=i+1
                int end = j;                           // for end

                for(int k=start;k<=end;k++){                //yha pe apne ko start aur end mil chuka h ab uske beech wle 
                    System.out.print(numbers[k] + " ");     // elements print krwane ke lie ye loop use kie h
                } 
                totalsubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays = " +totalsubarray);  
    }
    public static void main(String[] args){
        int[] numbers = {2,4,6,8,10};
        printsubarray(numbers);

    }
}
