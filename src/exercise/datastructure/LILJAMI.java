package exercise.datastructure;

import java.util.Scanner;

public class LILJAMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] stones = new int[N+3];
        int[] psa = new int[N+3];
        for(int i = 0; i <K; i++){
            stones[i] = sc.nextInt();
            psa[i] = psa[i-1] + stones[i];
        }
        int Q = sc.nextInt();
        for(int i = 0; i<Q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(psa[b] - psa[a-1]);
        }
    }
}
