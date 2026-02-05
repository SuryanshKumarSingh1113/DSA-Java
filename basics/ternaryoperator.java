package basics;
import java.util.*;
public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        String lyear=((year%4)==0) ? "leap year" :"notaleapnyear";
        System.out.println(lyear);
        sc.close();
    }
    
}
