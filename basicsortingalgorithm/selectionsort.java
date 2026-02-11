package basicsortingalgorithm;

public class selectionsort {
    public static void sort(int[] arr){
    
     for(int i = 0;i<arr.length-1;i++){
        int smallest = i;
        for(int j =i+1;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest=j;
            }

        }
       int temp = arr[i];
       arr[i] = arr[smallest];
       arr[smallest]=temp;
     }
}
 public static void Printarr(int[] arr){
  for(int i =0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
    
 }
    public static void main(String[] args){
        int[] arr={30,20,5,70,22};
        sort(arr);
        Printarr(arr);
    }

    
}
