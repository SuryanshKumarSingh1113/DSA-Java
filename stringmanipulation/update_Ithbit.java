package stringmanipulation;

public class update_Ithbit {

    public static int set_Ith_bit(int n,int i){                          //to set 0 as 1 on the given ith position
        int bitmask = 1<<i;
        return n|bitmask;
    }
    
    public static int clear_Ith_bit(int n,int i){                       //to clear 1 as 0 on the given ith position 
        int bitmask = ~(1<<i);
        return n & bitmask;

    }
    
    public static int update_Ith_bit(int n,int i,int newbit){           //based on the decision ie whether to set/clear the bits it update the bits
        if(newbit == 0){
            return clear_Ith_bit(n,i);
        }
        else{
            return set_Ith_bit(n, i);
        }
    }

    
    public static void main(String[] args) {
        System.out.println(update_Ith_bit(5, 0,0));
    }
}
