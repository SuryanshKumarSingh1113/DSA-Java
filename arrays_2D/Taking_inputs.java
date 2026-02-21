package arrays_2D;
import java.util.*;

public class Taking_inputs {
    public static void main(String[] args){
        int[][] matrix = new int[3][3];           // Syntax of 2D array

        //input
        System.out.println("Enter the elements:");
        Scanner sc = new Scanner(System.in);      
        int n=3;                                 // or n=matrix.length(rows)
        int m=3;                                 // or n=matrix[0].length(columns)
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
     
    
}