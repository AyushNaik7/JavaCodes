public class powofLogN {
     public static int powof(int x, int  n){
        if ( x ==0){
            return 0;
        }

        if (n ==0){
            return 1;
        }

     if ( n % 2 == 0){
        return powof(x, n/2) * powof(x, n/2);
     }

     else {
        return powof(x, n/2) * powof(x, n/2) * x;
     }

    }
    public static void main(String[] args) {

        int x=4;
        int n=2;

        int ans = powof(x, n);

        System.out.println(ans);
        System.out.println("thank you");


}
}
