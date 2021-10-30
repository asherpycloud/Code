package CCL1.C202109;

import java.util.Scanner;

public class C07BouncingSequence1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int k0 = k;
        System.out.print(k + " ");
        while(k>0){
            k-=5;
            System.out.print(k + " ");
        }
        while(k<k0){
            k+=5;
            System.out.print(k + " ");
        }
    }
}
