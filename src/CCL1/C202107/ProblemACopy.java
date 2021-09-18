package CCL1.C202107;

import java.util.Scanner;

public class ProblemACopy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i<=t; i++) {
            int n = sc.nextInt();
            String type = getType(n);
            System.out.println(n + " is " + type + " number.");
        }
    }

    static String getType(int n){
        int sum = 1;
        for(int i = 2; i<n; i++) {
            if (n%i == 0) sum += i;
        }
        if(sum == n) return "a perfect";
        else if(sum>n) return "an abundant";
        else return "a deficient";
    }
}
