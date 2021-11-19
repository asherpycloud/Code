package CCL1.C202109;

import java.util.Scanner;
import java.util.Stack;

public class C09TheGevenaConfection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i<T; i++){
            int N = sc.nextInt();
            int[] cars = new int[N];
            for(int j = 0; j<N; j++){
                cars[j] = sc.nextInt();
            }
            //Slide down to lake if car number is correct
            //Slide down to branch if not
            //Continue looking for the next number needed
            Stack<Integer> stack = new Stack<Integer>();
            int expected = 1;
            String result = "Y";
            for(int j = N-1; j>=0; j--) {
                if (cars[j] != expected) {
                    int topElement = stack.peek();
                    if (topElement != expected) {
                        result = "N";
                        break;
                    }
                    stack.push(cars[j]);

                }
            }
        }
    }
}

