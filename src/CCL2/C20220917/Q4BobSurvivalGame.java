package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4BobSurvivalGame {
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
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    public static void main(String[] args) throws IOException{
        int N = readInt(), T = readInt(), M = readInt();
        int[] players = new int[N];
        for(int i = 0 ;i <N; i++){
            players[i] = T;
        }
        for(int i = 0; i <M; i++){
            int A = readInt() - 1;
            for(int j = 0; j<N; j++){
                if(j != A) players[j]--;
            }
        }
        int cnt = 0;
        for(int i = 0 ;i <N; i++){
            if(players[i] >=0) cnt++;
        }
        System.out.println(cnt);
    }
}
/*
5 3 4
1
3
3
1

 */