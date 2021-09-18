package CCL1.C202109;

import java.util.Scanner;

public class FunctionCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = calculator(x);
        System.out.println(y);
    }

    static double calculator(double x){
        double y = 0;
        if(x<1) y=x;
        else if(1 <= x & x < 10) y = 2*x-1;
        else y = 3*x-11;
        return y;
    }
}

// read your input
// write your logic
// get your output and print your output
//