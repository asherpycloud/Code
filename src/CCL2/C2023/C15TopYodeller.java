package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C15TopYodeller {

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
        int n = readInt(), k = readInt();
        int[][] win = new int[k+1][n+1];
        for(int r = 1; r <= k; r++){
            for(int c = 1; c <= n; c++){
                int y = readInt();
                win[r][c] = win[r-1][c] + y;
            }
        }
        int m = Integer.MIN_VALUE;
        int top = -1;
        for(int c = 1; c <= n; c++){
            if(win[k][c] > m){
                m = win[k][c];
                top = c;
            }
        }
        int worst = 0;
        for(int r = 1; r < k; r++){
            int rank = 1;
            for(int c = 1; c <=n; c++){
                if(win[r][c] > win[r][top])
                    rank ++;
            }
            if (rank > worst)
                worst = rank;
        }
        System.out.println("Yodeller " + top + " is the TopYodeller: score " + m + ", worst rank " + worst);
    }
}

/*
5 2
99 97 100 85 -4
95 97 100 62 1000

 */