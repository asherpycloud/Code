package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C19LongPizza {
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
        int N = readInt(), x = readInt(), y = readInt(), R = readInt();
        int[] pizza = new int[N+1];
        for(int i = 0; i <R; i++){
            int l = readInt(), r = readInt();
            for(int j = l+1; j <= r+1; j++){
                pizza[j]++;
            }
        }

        int[] psa = new int[N+1];
        for(int i = 1; i <= N; i++){
            psa[i] = psa[i-1] + pizza[i];
        }
        System.out.println(psa[y+1] - psa[x]);
    }
}


/*
10
3 5
3
2 6
4 5
3 3

 */