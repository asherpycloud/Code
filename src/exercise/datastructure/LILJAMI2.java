package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LILJAMI2 {
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
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int K = readInt();
        int[] cups = new int[N+3];
        int[] psa = new int[N+3];
        for(int i = 0; i <K; i++){
            int k = readInt();
            cups[k]++;
        }
        for(int i = 0; i <N; i++){
            if(i == 0) psa[i] = cups[i];
            else psa[i] = psa[i-1] + cups[i];
        }
        int Q = readInt();
        for(int i = 0 ; i <Q; i++){
            int a = readInt();
            int b = readInt();
            if(a == 0 || b == 0) System.out.println(psa[b]);
            else System.out.println(psa[b] - psa[a-1]);
        }
    }
}
/*
5 3
1
1
2
2
0 2
2 4

 */