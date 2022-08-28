package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROBLEMB {
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
    public static void main(String[] args) throws IOException{
        int N = readInt();
        int Q = readInt();
        int[] counts = new int[1420000];
        for(int i = 0 ; i<N; i++){
            int x = readInt(), y = readInt();
            int d = (int)Math.ceil(Math.sqrt(1l * x * x + 1l * y * y));
            counts[d]++;
        }
        int[] psa = new int[1420000];
        for(int i = 1; i < 1420000; i++){
            psa[i] = psa[i-1] + counts[i];
        }
        for(int i = 0; i<Q; i++){
            int q = readInt();
            System.out.println(psa[q]);
        }
    }
}

/*
4 3
2 2
-4 0
0 -5
5 -5
2
4
6

 */
