import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take input from user for array
        int row = sc.nextInt();     // no of row
        int col = sc.nextInt();     // no of column

        // create 2D array(inttype)
        int[][] arry = new int[row][col];

        // take input for array value
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arry[i][j] = sc.nextInt();
            }
        }

        // print value
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arry[i][j]+ " "); 
            }
            System.out.println();
        }
    }
}
