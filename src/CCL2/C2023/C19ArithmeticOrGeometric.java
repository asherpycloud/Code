package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C19ArithmeticOrGeometric {
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
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
    public static void main(String[] args) throws IOException{
        int T = readInt();
        for(int i = 0; i < T; i++){
            long a1 = readLong(), a2 = readLong(), a3 = readLong(), k = readLong();
            if(a2-a1 == a3-a2){
                System.out.println((a1 + multiply(k-1, a2-a1, M) % M));
            }else {
                long t = quickPow(a2/a1, k-1, M);
                System.out.println(multiply(a1, t, M));
            }
        }
    }

    static long quickPow(long base, long exp, long MOD ){
        if (exp == 0) return 1;
        long tmp = quickPow(base, exp / 2, MOD);
        if(exp % 2 == 1) return ((tmp * tmp ) % MOD * base ) %MOD;
        else return tmp*tmp % MOD;
    }

    static long multiply(long x, long y, long M){
        return ((x % M) * (y % M)) % M;
    }
}

/*
2
1 2 3 5
1 2 4 5

 */