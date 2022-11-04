package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3PowerBase {
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
    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }
    public static void main(String[] args)throws IOException{
        int N = readInt();
        for(int i = 0; i <N; i++){
            double X = readDouble();
            int P = readInt();
            double n = X;
            for(int j = 0; j < P-1; j++){
                n = n * X;
            }
            System.out.printf("%.2f\n", (double)n);
        }
    }
}

/*
3
2.0 4
4.0 2
3.0 3

*/


//https://dmoj.ca/problem/p124ex5