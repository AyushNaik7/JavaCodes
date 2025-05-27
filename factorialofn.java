
import java.util.Scanner;

public class factorialofn {

    public static int factofn(int n){

        if (n==0 || n==1){
            return 1;
        }

        int factofnm1 =factofn(n-1);
        int factofn = n * factofnm1;
        return factofn;

        
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n= input.nextInt();

        int ans = factofn(n);

        System.out.println(ans);


    }
}
