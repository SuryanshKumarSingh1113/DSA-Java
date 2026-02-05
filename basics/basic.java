package basics;
import java.util.*;
public class basic{
    public static void main(String args[]){
        System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
        sc.close();
    }
}