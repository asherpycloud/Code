package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C14DoubleKnockoutCompetition {
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
        for(int i = 0; i < n; i++){
            int t = readInt();
            System.out.println("Round 0: " + t + " undefeated, 0 one-loss, 0 eliminated");
            int un = t, ol = 0, e = 0;
            int cnt = 0;
            while(un > 1 || ol > 1){
                cnt++;
                e += ol / 2;
                ol = ol - (ol / 2) + (un / 2);
                un -= un / 2;
                System.out.println("Round " + cnt + ": " + un + " undefeated, " + ol + " one-loss, " + e + " eliminated");
            }
            cnt++;
            System.out.println("Round " + cnt + ": " + (un - 1) + " undefeated, " + (ol + 1) + " one-loss, " + e + " eliminated");
            cnt++;
            System.out.println("Round " + cnt + ": " + (un - 1) + " undefeated, " + (ol - 1) + " one-loss, " + (e + 1) + " eliminated");
            System.out.println("There are " + cnt + " rounds.");
        }
    }
}

/*
1
2

 */
