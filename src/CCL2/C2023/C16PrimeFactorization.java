package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C16PrimeFactorization {
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
        for(int i = 0; i < N; i++){
            int x = readInt(), y = (int)Math.sqrt(x);
            for(int j=2; j<=y; j++){
                while(x % j == 0){
                    System.out.print(j + " ");
                    x /= j;
                }
            }
            if(x != 1) System.out.println(x);
            else System.out.println();
        }
    }
}

/*
5
3
13
42
666
1369

 */