package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C013MissingNumbers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
    public static void main(String[] args) throws IOException {
        long T = readLong();
        for(int i = 0; i < T; i++){
            long N = readLong(), S = readLong();
            long t = (1+N) * N / 2;
            long d = t-S;
            if (d <= N) System.out.println((d-1) / 2);
            else System.out.println((N - (d-N) + 1) / 2);
        }
    }
}

/*
2
5 9
2 0

 */