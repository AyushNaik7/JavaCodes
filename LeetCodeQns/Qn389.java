package LeetCodeQns;

public class Qn389 {
    
    public static void main(String[] args) {
        String s = "abcd";
        String t = "dcbae";

        int sumS = 0;
        int sumT=0;

        for (int i =0 ; i <s.length() ; i++){

            sumS = sumS + (int)  s.charAt(i)   ; //casting kiya hein char se int me //
        }

        for (int i =0 ; i <t.length() ; i++){
            sumT = sumT + (int)  t.charAt(i);
        }


        char extraChar = (char) (sumT - sumS) ;
        System.out.println(extraChar);
    }
}
