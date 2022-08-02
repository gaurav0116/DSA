package Recursion;

public class SumNutralNum {
    static int sum =0;
    static void RecursionFun(int num){
        // Base condation (1 to 5 number's sum )
        if(num>=5){
            return;
        }
        sum = sum + num;
        RecursionFun(num+1);

    }
    public static void main(String[] args) {
        int num =1; // initial number
        RecursionFun(num);
    }
}
