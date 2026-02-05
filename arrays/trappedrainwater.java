package arrays;
public class trappedrainwater {
    public static int Trappedrainwater(int[] height){
        int n = height.length;

       // for creating leftmax boundary
        int[] leftmax = new int[n] ;
        leftmax[0] = height[0];
        for(int i = 1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        
        //for rightmax
       int[] rightmax = new int[n];
       rightmax[n-1] = height[n-1];
       for(int i = n-2;i>=0;i--){
        rightmax[i] = Math.max(height[i],rightmax[i+1]);
       }
       
       int trappedrainwater = 0;
       // to calculate water level
       for(int i=0;i<n;i++){
       int waterlevel = Math.min(leftmax[i],rightmax[i]) ;
       // for final trappedrainwater
       trappedrainwater += waterlevel - height[i];
    }
    return trappedrainwater;
    }
    public static void main(String[] args) {
        int[] height ={4,2,0,6,3,2,5};
        System.out.println( Trappedrainwater(height) );
}
}