package ccc.y1996;

import java.util.Scanner;

public class S2DivisibilityBy11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i<num; i++){
            long n = sc.nextLong();
            long rem = 0;
            if(n>99){
                long m = n/10;
                long sub = n - (m*10);
                rem = m - sub;
                System.out.println(rem);
            }
            if(rem % 11 == 0) System.out.println("The number " + n + " is divisible by 11.");
            else System.out.println("The number " + n + " is not divisible by 11.");
        }
    }
}
