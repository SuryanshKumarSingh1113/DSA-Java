package stringmanipulation;

public class powerof2 {
    public static boolean checkforpowerof2(int n){
        return ((n&(n-1))==0);
                                                                                                        // if((n&(n-1))==0){ 
                                                                                                        //     return true;
                                                                                                        // }
                                                                                                        // else{
                                                                                                        //     return false;
                                                                                                          // }
    }
    public static void main(String[] args) {
        System.out.println(checkforpowerof2(4));
    }
}
