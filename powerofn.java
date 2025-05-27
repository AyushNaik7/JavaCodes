import java.util.Scanner;

public class powerofn {
    
    public static int powof(int n , int  x){
        if ( x ==0){
            return 0;
        }

        if (n ==0){
            return 1;
        }

       int powofnm1= powof(n-1, x);
       int powofn = n * powofnm1;
       return powofn;

    }
    public static void main(String[] args) {

        int n=4;
        int x=2;

        int ans = powof(n, x);

        System.out.println(ans);



    }
}
