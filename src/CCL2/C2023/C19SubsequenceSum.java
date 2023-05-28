package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
Addition
(x + y) % M = ((x % M) + (y % M)) % M

Multiply
(x * y) % M = ((x % M) * (y % M)) % M

Power
x^n % MOD = (x^n/2 * x^n/2) % MOD
 */


public class C19SubsequenceSum {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static long M = (long)Math.pow(10, 9) + 7;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException{
        int N = readInt();
        long total = 0;
        long n = quickPow(2, N-1, M);
        for(int i = 0; i < N; i++){
            long x = readInt();
            long r = (n * (x % M)) % M;
            total = (total + r) % M;
        }
        System.out.println(total % M);
    }

    static long quickPow(long base, long exp, long MOD ){
        if (exp == 0) return 1;
        long tmp = quickPow(base, exp / 2, MOD);
        if(exp % 2 == 1) return ((tmp * tmp ) % MOD * base ) %MOD;
        else return tmp*tmp % MOD;
    }
}


/*
3
1 2 3

 */