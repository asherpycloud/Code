package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C17ArrayAnger {
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
        int n = readInt(), q = readInt(), psa[] = new int[n+1];
        for(int i = 1; i <= n; i++){
            psa[i] = psa[i-1] + readInt();
        }
        for(int i = 1; i <=q; i++){
            String word = next(); int L = readInt(), s = readInt();
            int p = Arrays.binarySearch(psa, psa[L-1] + s);
            if(p < 0) p = -p -1;
            if(p == psa.length) System.out.println(n);
            else System.out.println(p);
        }
    }
}

/*
6 6
1 5 3 2 1 7
OI 1 50
OI 1 19
OI 4 1
OI 1 12
OI 1 10
OI 2 8

 */