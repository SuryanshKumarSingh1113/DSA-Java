package stringmanipulation;

public class EvenOdd_numbers {
    public static void checknumber(int n){
        int bitmask = 1;
        if((n&bitmask)==1){                                  //AND(&)operator is used
            System.out.println(n+" is an odd number");
        }
        else{
            System.out.println(n+" is an even number");
        }       
     }
    public static void main(String[] args) {
        checknumber(13);                              
        checknumber(4);
        checknumber(2021);
    } 
    }
    
      //computer stores values in binary ie 13=>1101 and bitmask = 1 =>0001
      //then 1101(13) & 0001(1) => 0001(1) =>ie odd number
     

