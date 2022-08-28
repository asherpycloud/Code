package exercise.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CYCLICSHIFTS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1<<20);
        String[] arr = br.readLine().split(" ");
        int N = gi(arr[0]), Q = gi(arr[1]);
        int[] marks = new int[N + 1];
        int[] psa = new int[N + 1];
        arr = br.readLine().split(" ");
        for(int i = 1; i < N+1; i++){
            marks[i] = gi(arr[i-1]);
            psa[i] = psa[i-1] + marks[i];
        }

        for(int i = 0; i < Q; i++){
            arr = br.readLine().split(" ");
            int L = gi(arr[0]);
            int R = gi(arr[1]);
            System.out.println((psa[R] - psa[L-1]) / (R-L + 1));
        }
    }
    static int gi(String s) {
        int n = 0;
        for (int i=0; i<s.length(); i++)
            n = (n<<3) + (n<<1) + s.charAt(i) - '0';
        return n;
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
