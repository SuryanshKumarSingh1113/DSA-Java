package arrays;

public class reverse {

    public static void reverseofanarray(int[] numbers){
       
        int first = 0;int last = numbers.length-1;
        while (first < last) {

            int temp = numbers[last];                    //to swap
            numbers[last] = numbers[first];
            numbers[first] = temp;
           
            first++;
            last--;
        }
       
       
    }
    public static void main(String[] args) {
        int[] numbers = {54,65,663,32 };
        reverseofanarray(numbers);
        //to print the array
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i] +" ");
        }
        System.out.println("");
       
    }
}
