package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C17NotQuitePrime2 {

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
        for(int t = 0; t < 5; t++){
            int n = readInt();
            if(isSemiprime(n)) System.out.println("semiprime");
            else System.out.println("not");
        }
    }

    static boolean isPrime(int n) {
        for (int i=2; i*i<=n; i++)
            if (n % i==0) return false;
        return true;
    }

    static boolean isSemiprime(int n){
        for (int i=2; i*i<=n; i++) {
            if (n % i==0){
                int q = n/i;
                if (isPrime(q) && isPrime(i)) return true;
                else return false;
            }
        }
        return false;
    }
}
