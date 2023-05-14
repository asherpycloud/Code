package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C15BambooCookies {
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
        int oc = 0, ec = 0;
        for(int i = 0; i < N; i++){
            int a = readInt();
            if(a % 2 == 0) ec++;
            else oc++;
        }
        System.out.println((ec/2) + (oc/2));
    }
}

/*
8
1 2 3 4 5 6 7 11

 */

/*
4
1 2 3 4

 */