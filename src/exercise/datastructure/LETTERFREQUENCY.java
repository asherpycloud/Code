package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LETTERFREQUENCY {
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
        String S = br.readLine();
        int Q = readInt();
        for(int t = 0; t < Q; t++){
            int i = readInt();
            int j = readInt();
            char c = next().charAt(0);
            int cnt = 0;
            for(int k = i-1; k <= j-1; k++){
                if(S.charAt(k) == c) cnt++;
            }
            System.out.println(cnt);
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
