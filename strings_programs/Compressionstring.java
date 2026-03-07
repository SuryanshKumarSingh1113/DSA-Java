package strings_programs;

public class Compressionstring {

    public static String Compression_String(String sentence){
        String newsentence = "";

        for(int i =0;i<sentence.length();i++){
            Integer count = 01;
            while(i<sentence.length()-1 && sentence.charAt(i)==sentence.charAt(i+1)){
                count++;
                i++;
            }
              newsentence += sentence.charAt(i);
              if(count>1){
                newsentence += count.toString();
              }
        }
            return newsentence;
    }
    public static void main(String[] args) {
        String sentence="aaabbbccddd";
        System.out.println(Compression_String(sentence));
    }
    
}
