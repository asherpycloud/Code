package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q1MultipleOf3 {
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
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    public static void main(String[] args) throws IOException{
        int N = readInt();
        BigInteger t = new BigInteger("3");
        for(int i = 0; i <N; i++){
            String a = next();
            BigInteger x = new BigInteger(a);
            if((x.mod(t)).equals(0)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}

/*
3
342
121
3333333333333333333333333333333333333

 */