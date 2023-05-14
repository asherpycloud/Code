package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C13FreeShirst {
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
        for(int i = 0; i<10; i++) {
            int N = readInt(), M = readInt(), D = readInt();
            int s = N, cs = N, cnt = 0;
            int[] A = new int[D];
            for(int j = 0; j<M; j++) A[readInt()-1]++;
            for(int j = 0; j<D; j++) { // no event shirt
                // 6am
                if (cs == 0) {
                    cnt++;
                    cs = s;
                }
                // 7am
                cs--;
                // 8am: events
                s += A[j];
                cs += A[j];
            }
            System.out.println(cnt);
        }
    }
}

/*
1 1 10
10
1 3 10
2 9 5

 */