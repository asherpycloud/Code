package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C01CrazyFenching {
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
        int[] h = new int[N+3];
        for(int i = 0; i <=N; i++){
            h[i] = readInt();
        }
        double a = 0;
        for(int i = 0 ; i<N; i++){
            int w = readInt();
            a += 1.0 * w *(h[i] + h[i+1])/2;
        }
        System.out.println(a);
    }
}
