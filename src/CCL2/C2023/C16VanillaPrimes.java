package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C16VanillaPrimes {
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
        int n = readInt();
        if(n<=1) System.out.println("not");
        else{
            boolean isPrime = true;
            for (int i=2; i*i<=n; i++) {
                if (n % i == 0) isPrime = true;
            }
            if(isPrime = true) System.out.println("prime");
        }
    }
}
