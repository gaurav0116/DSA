package Array;
import java.util.*;

public class Array{
    public static void main(String[] args){

        // Method 1. Creat array
            int[] marks = new int[3];

            // insert value in array
            marks[0]=56;
            marks[1]=53;
            marks[2]=57;
            // print Array
            for(int i=0;i<marks.length; i++){
                System.out.println(marks[i]);
            }

        // Method 2. Creat array & insert value at that time
            // int marks[] = {78, 97, 68};
            // // print Array
            // for(int i=0;i<marks.length; i++){
            //     System.out.println(marks[i]);
            // }

        // Method 3. Take array size & value input from the user
            // Scanner sc = new Scanner(System.in);
            // int size = sc.nextInt(); // store user input in num variable
            // int arr[] = new int[size];
            
            // for( int j=0; j<size; j++ ){
            //     int num = sc.nextInt();
            //     arr[j] = num;
            // }

            // for(int i=0; i<size; i++){
            //     System.out.println(arr[i]);
            // }


            // Que 
            // System.out.println("Enter the size of array:");
            // Scanner sc = new Scanner(System.in);
            // int size = sc.nextInt();
            // int array[] = new int[size];

            // System.out.println("Enther the values in array:");
            // for(int i=0; i<size; i++){
            //     array[i] = sc.nextInt();
            // }

            // System.out.println("Your array is :");
            // for(int i=0; i<array.length; i++){
            //     System.out.print(array[i] + " ");
            // }

            // int x=15;
            // for(int i=0; i<array.length; i++){
            //     if(array[i]==x){
            //         System.out.println("X is availble of index no: " + i);
            //     }
            // }
    }
}