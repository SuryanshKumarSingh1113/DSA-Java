package strings_programs;

public class Palindrome{

    public static boolean isPalindrome(String word){
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                return false;                                          //its not a palindrome
            }
         } 
         return true;                                                  ////its a palindrome 
    }

    public static void main(String[] args) {
        String word = "hello" ;
       System.out.println(isPalindrome(word));
    }
    
}
    
