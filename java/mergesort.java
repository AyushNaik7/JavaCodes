package java;

public class mergesort {

    public static void merge (int arr[] , int si , int ei , int mid){
    
    if(si>=ei){
        return;
    }
    


    }


    public static void divide (int arr[] , int si, int ei ){

        if(si>=ei){
            return;
        }

        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid +1, ei);


    }
    
    public static void main(String[] args) {
        int arr[] = {6,4,3,2};
        int n = arr.length;
    }

}
