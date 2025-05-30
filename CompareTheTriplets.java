import java.util.Scanner;

public class CompareTheTriplets {

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        int[] arr1 = new int[3];
        int [] arr2 = new int[3];


        for (int i=0 ; i<arr1.length ; i++){
            arr1[i] = input.nextInt();
        }

        for (int i=0 ; i<arr1.length ; i++){
            arr2[i] = input.nextInt();
        }

        int alicescore = 0;
        int bobscore =0;
        


        for ( int i=0; i<3 ; i++){

            if(arr1[i] > arr2[i]){
                alicescore = alicescore +1;
            }

            else if ( arr1[i] < arr2[i]){
                bobscore = bobscore+1;
            }

            
        }

        System.out.println(alicescore + " " + bobscore);
      

    }
}
