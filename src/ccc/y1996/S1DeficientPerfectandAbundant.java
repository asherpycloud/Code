package ccc.y1996;

import java.util.Scanner;

public class S1DeficientPerfectandAbundant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int j = 0; j<i;j++){
            int n = sc.nextInt();
            int sum = 0;
            for(int k = 1; k<n; k++){
                if(n%k == 0) sum = sum + k;
            }
            if(n == sum) System.out.println(n + " is a perfect number.");
            else if(n > sum) System.out.println(n + " is a deficient number.");
            else System.out.println(n + " is an abundant number.");
        }
    }
}
