package Sorting;
// import java.util.*;

public class BubbleSort {

    // bubble sort logic
    public static void sort(int arr[]){
        // outer loop for (arr.lenth-1) iteration
        for(int i=0; i<arr.length-1; i++){
            // inner loop its run (arr.lenth - no_of_sorted_element - 1 )
            for(int j=0; j<arr.length-i-1; j++){
                // when left > right elemnt 
                if(arr[j]>arr[j+1]){
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
            }
        }
    }

    // print sorted array
    public static void PrintSortedArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,2,7,1,4};
        sort(arr);
        PrintSortedArray(arr);
    }
}
