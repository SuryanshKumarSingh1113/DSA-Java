package basicsortingalgorithm;

public class countingsort {
    public static void Sort(int[] array){

          // finding the maximum number to obtain a range of counting array
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            largest= Math.max(largest,array[i]);
        }

          //create a counting array which counts the frequency of the numbers
          int[] count = new int[largest+1];
          for(int i=0;i<array.length;i++){
            count[array[i]]++;
          }
         
          //Sorting
          int j = 0;
          for(int i=0;i<count.length;i++){
            while(count[i]>0){
                array[j]=i;
                j++;
                count[i]--;
            }
          }

    }
        //printing the array
         public static void Printarray(int[] arrays){
        for(int i = 0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
    }
     
    public static void main (String[] args){
        int array[]={1,4,1,3,2,4,3,7};
        Sort(array);
        Printarray(array);
    }
    
}
