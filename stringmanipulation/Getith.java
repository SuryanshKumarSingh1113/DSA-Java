package stringmanipulation;

public class Getith {
    public static int getIthBit(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10,2));
        System.out.println(getIthBit(10,3));
    }
}

//n=10=>1010
//i=2 it means i declares the bit(0/1) on the position 2
