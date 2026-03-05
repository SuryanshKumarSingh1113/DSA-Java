package stringmanipulation;

public class Set_Ith {
    public static int SetIthBit(int n,int i){
        int Bitmask = 1<<i;
        return n|Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(SetIthBit(10, 2));
    }
}

//we have to make 1 on the given ith position