import java.io.PrintStream;

public class PermutationOfString {

    public static void PermutationOfString(String str , String Permutation){
        if (str.length() == 0){
            System.out.println(Permutation);
            return;}


            for(int i=0;i<str.length();i++){
                char currchar= str.charAt(i);
String newstr = str.substring(0, i) + str.substring( i + 1);
PermutationOfString(newstr , Permutation + currchar);



            }
        
    }
    public static void main(String[] args) {
        
String str = "abc";
PermutationOfString(str , "");

    }
}
