package Sorting;

public class SelectionSort {
    static void sort(int array[]){
        // outer loop
        for(int i =0; i<array.length-1; i++){
            // inner loop 
            int smallest = i;
            for(int j=i+1; j<array.length; j++){
                if(array[smallest]>array[j]){
                    smallest = j;
                }
            }
            // Swap
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
    }

    static void PrintSortedArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
    public static void main(String[] args) {
        // unsorted array
        int array[] = {9,12,3,5,6};
        sort(array);
        PrintSortedArray(array);
    }
}
