package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1TimeToDecompress {
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
        int L = readInt();
        for(int i = 0; i < L; i++){
            int N = readInt();
            char sym = next().charAt(0);
            for(int j = 0; j <N; j++){
                System.out.print(sym);
            }
            System.out.println();
        }
    }
}
/*
4
9 +
3 -
12 A
2 X

 */


//https://dmoj.ca/problem/ccc19j2