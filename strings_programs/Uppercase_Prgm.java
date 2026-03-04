                            //Convert the first letter of each word of a sentence in upper case
package strings_programs;

public class Uppercase_Prgm{
    public static String converttoUppercase(String sentence){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(sentence.charAt(0));
                sb.append(ch);

        for(int i  = 1; i<sentence.length();i++){
            if(sentence.charAt(i)==' ' && i<sentence.length()-1){
                sb.append(sentence.charAt(i));
                i++;
                sb.append(Character.toUpperCase(sentence.charAt(i)));
            }
                else{
                    sb.append(sentence.charAt(i));
                }

            }
            return sb.toString();
        }

    
    public static void main(String[] args) {
        String sentence = "i didnt understood this game";
        System.out.println(converttoUppercase(sentence));
    }
}

