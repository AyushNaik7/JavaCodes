import java.util.Scanner;

public class powerofn {
    
    public static int powof(int x, int  n){
        if ( x ==0){
            return 0;
        }

        if (n ==0){
            return 1;
        }

       int powofnm1= powof(x, n-1);
       int powofn = x * powofnm1;
       return powofn;

    }
    public static void main(String[] args) {

        int x=4;
        int n=2;

        int ans = powof(x, n);

        System.out.println(ans);
        System.out.println("thank you");



    }
}
