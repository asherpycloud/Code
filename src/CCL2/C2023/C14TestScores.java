package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C14TestScores {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
    public static void main(String[] args) throws IOException{
        long N = readLong();
        for(int i = 0; i <N; i++){
            long n = readLong(), a = readLong(), b = readLong(), t = readLong();
            long x =  (long) Math.ceil(1.0d * (b*n + t) / (a+b));
            if(x <= 0 || x>n) System.out.println("-1");
            else System.out.println(x);
        }
    }
}
