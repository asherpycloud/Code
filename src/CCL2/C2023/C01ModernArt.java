package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C01ModernArt {
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
    public static void main(String[]args) throws IOException {
        int M = readInt(); //row
        int N = readInt(); //column
        boolean[][] canvas = new boolean[M][N];
        int K = readInt();
        for (int i = 0; i < K; i++) {
            String d = next();
            if (d.equals("R")) {
                int n = readInt()-1;
                for (int j = 0; j < N; j++) {
                    if(!canvas[n][j]) canvas[n][j] = true;
                    else canvas[n][j] = false;
                }
            } else {
                int n = readInt()-1;
                for (int j = 0; j < M; j++) {
                    if(!canvas[j][n]) canvas[j][n] = true;
                    else canvas[j][n] = false;
                }
            }
        }
        long cnt = 0;
        for(int i = 0; i <M; i++){
            for(int j = 0; j<N; j++){
                if(canvas[i][j] == true) cnt++;
            }
        }
        System.out.println(cnt);
    }
}


/*
3
3
2
R 1
C 1

 */

/*
4
5
7
R 3
C 1
C 2
R 2
R 2
C 1
R 4

 */


//https://dmoj.ca/problem/ccc21s2
