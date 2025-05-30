public class ReverseString {

    public static void RevStr(int idx , String str){
         if (idx == 0){
            System.out.println(str.charAt(idx));
            return;
         }

         System.out.println(str.charAt(idx));
         RevStr(idx-1,str);

       
    }
    public static void main(String[] args) {

        String str = "abcd";
        RevStr(str.length()-1, str);
      
    }
}
