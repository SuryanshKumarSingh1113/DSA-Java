package arrays_2D;

public class MatrixSearch {
    public static boolean search(int[][]matrix,int key){

        for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                if(key==matrix[i][j]){
                    System.out.println("Key is found at:" +"("+i+","+j+")");
                    return true;
                }
             }
        }
        System.out.println("Key not found");
          return false;
    }
    
    public static void main(String[] args) { 
        int[][] matrix = {{1,2,5},
                          {6,16,90}};
             search(matrix,29);
    }
}
