package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C14BobAndBusSopts {
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
        int N = readInt(), Q = readInt();
        int[] stops = new int[N+1];
        int maxstop = 0;
        // read in stop numbers and get max stop number
        for(int i = 1; i <= N; i++) {
            stops[i] = readInt();
            if (stops[i] > maxstop) maxstop = stops[i];
        }

        boolean[] stopmark = new boolean[maxstop+1];
        int[] psa = new int[maxstop+1];
        // mark stops
        for(int i = 1; i <= N; i++) {
            stopmark[stops[i]] = true;
        }
        // initialize psa
        for(int i=1; i<=maxstop; i++) {
            if (stopmark[i]) psa[i] = psa[i-1] + 1;
            else psa[i] = psa[i-1];
        }

        // deal the queries
        for(int i = 0; i < Q; i++) {
            int l = readInt(), r = readInt();
            int result = 0;
            if (l > maxstop || r > maxstop || l > r) result = 0;
            else if (l == r) {
                if (stopmark[l]) result = 1;
                else result = 0;
            } else {
                result = psa[r] - psa[l];
                if (stopmark[l]) result ++;
            }
            System.out.println(result);
        }
    }
}


