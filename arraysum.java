

import java.util.Scanner;



public class arraysum {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
   int sum  = 0;
        for(int i =0;i<arr.length;i++){

       
          sum = sum +arr[i];

           
        }
        System.out.println(sum);
        
    }
}
