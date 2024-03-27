package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C20BobAndCanada {
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
        int T = readInt();
        for(int i = 0; i < T; i++){
            int n = readInt();
            String s = next();
            int[] w = new int[s.length() + 1];
            int[] r = new int[s.length() + 1];
            int[] mina = new int[s.length() + 1];
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == 'R') r[j+1] = r[j] + 1;
                else r[j+1] = r[j];
                if(s.charAt(j) == 'W') w[j+1] = w[j] + 1;
                else w[j+1] = w[j];
                mina[j+1] = Math.min(w[j+1] - r[j+1], w[j]);
            }
            int min = Integer.MAX_VALUE;
            for(int b = 2; b < s.length(); b++){
                int ans = (w[n] - w[b]) + r[b] + mina[b];
                if(ans < min) min = ans;
            }
            System.out.println(min);
        }
    }
}

/*
8
3
RWR
3
WWW
3
WRR
4
RWRW
6
WWWRRR
6
WWRRWW
10
RRRRWWRWRR
10
WWRRWWWWRW

 */