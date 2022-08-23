package exercise.datastructure;

import java.util.Scanner;

public class CYCLICSHIFTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] marks = new int[N + 1];
        int[] psa = new int[N + 1];
        for(int i = 1; i < N+1; i++){
            marks[i] = sc.nextInt();
            psa[i] = psa[i-1] + marks[i];
        }

        for(int i = 0; i < Q; i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            System.out.println((psa[R] - psa[L-1]) / (R-L + 1));
        }
    }
}

/*
5 3
100 50 0 75 90
1 2
2 3
2 5

 */

/*
4
9 +
3 -
12 A
2 X

*/

/*
100
3
150
1
1

 */
