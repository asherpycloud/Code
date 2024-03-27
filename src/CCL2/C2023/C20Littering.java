package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C20Littering {
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
    static Long readLong() throws IOException {
        return Long.parseLong(next());
    }
    public static void main(String[] args) throws IOException{
        int N = readInt(), K = readInt();
        long[] garbage = new long[N];
        for(int i = 0; i < N; i++){
            garbage[i] = readInt();
        }
        Arrays.sort(garbage);
        long max = 0;
        for(int i = 0; i <K; i++){
            max += garbage[N-1-i];
        }
        System.out.println(max);
    }
}

/*
5 2
3 4 2 1 5

 */