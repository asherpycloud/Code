package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class C19LoveGuru {
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
        String J = next();
        String R = next();
        int j = loveguru(J);
        int r = loveguru(R);
        if(j == 0) j = 10;
        if(r == 0) r = 10;
        System.out.println(j + r);
    }

    static int loveguru(String s){
        String us = s.toUpperCase();
        int score = 0;
        for(int i = 0 ; i < us.length(); i++){
            char c = us.charAt(i);
            int n = c - 'A' + 1;
            int t = (int)quickPow(n, i+1, 10);
            score += t;
        }
        return score % 10;
    }
    static long quickPow(long base, long exp, long MOD ){
        if (exp == 0) return 1;
        long tmp = quickPow(base, exp / 2, MOD);
        if(exp % 2 == 1) return ((tmp * tmp ) % MOD * base ) %MOD;
        else return tmp*tmp % MOD;
    }
}

/*
Romeo
Juliet

 */