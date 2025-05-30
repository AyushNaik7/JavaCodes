
public class FirstAndLastOcc {


    public static int first = -1;
    public static int last = -1;
    public static void Occu( int idx , String str , char element){

        if ( idx == str.length()){

            System.out.println("the element's first occ is at " + first);
            System.out.println("the element's last occ is at " + last);
            return;
        }
     

            if ( str.charAt(idx) == element){

            if ( first == -1){
                first = idx;
            }
            else{
                last = idx;
            }

            }

            Occu(idx+1 , str, element);

           

            }
        
    
    public static void main(String[] args) {
        String str = " aabbaa ";

        
       
        Occu( 0 , str, 'a');
    }
}
