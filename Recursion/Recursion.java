package Recursion;

public class Recursion {

    //Recursion function that's print 1 to 5 num 
    static void PrintNum(int n){
        if(n>=5){ 
            return;     // condition follow then return back (use for stop the recursion)
        }
        System.out.println(n);
        PrintNum(n+1);  // Recursive function
    }


    public static void main(String[] args) {
        int n=1;
        PrintNum(n);
    }
}
