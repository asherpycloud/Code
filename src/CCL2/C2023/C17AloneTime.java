package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C17AloneTime {
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
        int n = readInt(), m = readInt(), k = readInt();
        int a[] = new int[n+2];
        a[n+1] = m + 1;
        for(int i = 1; i <= n; i++){
            a[i] = readInt();
        }
        int ans = 0;
        for(int i = 1; i <= n+1; i++){
            if(i > 1) ans = Math.max(ans, a[i] - Math.max(a[i-1]-k, a[i-2]) - 1);
            if(i <= n) ans = Math.max(ans, Math.min(a[i]+k, a[i+1]) - a[i-1] - 1);
        }
        System.out.println(ans);
    }
}

/*
2 10 2
1 7

 */