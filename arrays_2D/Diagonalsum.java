package arrays_2D;

public class Diagonalsum {
               ////BRUTE FORCE APPROACH
    
  public static int diagonalmatrix(int[][]matrix){
    int sum=0;
    for(int i=0;i<=matrix.length;i++){          //for rows
        for(int j=0;j<matrix[0].length;j++){    //for columns
            if(i==j) {
             sum += matrix[i][j];
                
            }
           else if (i+j==matrix.length-1) {    
                sum += matrix[i][j];
            }
        }
    }
    return sum;
 }                            //TC=O(n^2)                            
          
          public static int optimizedcode(int[][] matrix){
            int sum =0;
            for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];                  //primary diagonal

            if(i!=matrix.length-i-1){
            sum += matrix[i][matrix.length-i-1];  //secondary diagonal
              }
          }
     return sum;
    }  
                 //TC=O(n)
 public static void main(String[] args) {
    int[][] matrix = {{1,2,3},
                       {5,6,7},
                       {9,10,11},
                       };
     System.out.println(diagonalmatrix(matrix));
     System.out.println(optimizedcode(matrix));
   
 }
}