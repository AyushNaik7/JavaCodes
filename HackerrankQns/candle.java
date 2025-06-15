import java.util.Scanner;


public class candle {

    public static int birthdayCandles ( int[] candles){

int max = candles[0];
int count =1;

for(int i =1;i<candles.length;i++){
    if(candles[i] > max){
        max = candles[i];
        count=1;
    }
    else if (candles[i] == max){
count++;
    }

}
return count;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = input.nextInt();

        }
        int result = birthdayCandles(arr);
        System.out.println(result);


        
    }
}
