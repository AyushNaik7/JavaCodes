

public class fibonacci {
    public static void fibonnaci(int a, int b, int n){
        if ( n == 1){
return;
        }
        int c = a+b;
        System.out.println(c);
        fibonnaci(b, c, n-1);
    }
    public static void main(String[] args) {
       

int a =0;
int b=1;
System.out.println(a);
System.out.println(b);

int n=8;

fibonnaci(a, b, n-2);
    }
}
