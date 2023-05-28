package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C18ModInverse {
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
        int x = readInt(), m = readInt();
        boolean found = false;
        for(int i = 1; i <= 1000; i++){
            int sum = m * i + 1;
            int n = sum / x;
            if(n >= m) break;
            if(sum % x == 0) {
                System.out.println(n);
                found = true;
                break;
            }
        }
        if(!found) System.out.println("No such integer exists.");
    }
}
