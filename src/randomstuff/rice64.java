package randomstuff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class rice64 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static Long readLong() throws IOException {
        return Long.parseLong(next());
    }
    public static void main (String[] args) throws IOException{
        long rice = 32940614417338L;
        System.out.println(rice*17);
    }
}
