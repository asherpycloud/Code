package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LETTERFREQUENCY3 {
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
        String S = " " + br.readLine();
        int Q = readInt();
        int[][] cnt = new int[27][S.length() + 3];
        int[][] psa = new int[27][S.length() + 3];
        for(int i = 1; i < S.length(); i++){
            char cur = S.charAt(i);
            if(cur != ' '){
                cnt[cur-'a'+1][i]++;
            }
        }
        for(int i = 1; i<=26; i++){
            for(int j = 1; j<=S.length(); j++){
                psa[i][j] = psa[i][j-1] + cnt[i][j];
            }
        }
        for(int k = 0; k < Q; k++){
            int i = readInt();
            int j = readInt();
            char c = next().charAt(0);
            System.out.println(psa[c-'a'+1][j] - psa[c-'a'+1][i-1]);
        }
    }
}
/*
this is a very interesting sentence and you will agree
4
1 4 h
6 6 p
15 26 t
1 54 e

 */