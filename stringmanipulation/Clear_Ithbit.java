package stringmanipulation;

public class Clear_Ithbit {
    public static int clearIth(int n,int i){
        int bitmask= ~(1<<i);
        return n & bitmask;

    }
    public static void main(String[] args) {
        System.out.println(clearIth(10, 1));
        
    }
    
}
//we have to make 0 on the given ith position