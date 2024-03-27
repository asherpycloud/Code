package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C20Eko {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
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
    public static void main(String[] args) throws IOException {
        int N = readInt();
        long M = readLong();
        int[] h = new int[N];
        for(int i = 0; i < N; i++){
            h[i] = readInt();
        }
        long wood = 0;
        Arrays.sort(h);
        for(int i = N - 2; i >= 0; i--){
            long delta = h[i+1] - h[i];
            long count = N - 1 - i;
            wood += delta * count;
            if (wood >= M){
                wood -= delta * count;
                long realDelta = (long)Math.ceil((M - wood) * 1.0 / count);
                long ret = h[i+1] - realDelta;
                System.out.println(ret);
                break;
            }
        }
    }
}


/*
4 7
20 15 10 17

 */