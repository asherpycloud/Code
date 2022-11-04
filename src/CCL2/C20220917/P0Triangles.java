package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P0Triangles {
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
        int[] x = new int[N], y = new int[N];
        for(int i = 0; i <N; i++){
            x[i] = readInt(); y[i] = readInt();
        }
        int ans = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                for(int k = 0; k < N; k++){
                    if(y[i] == y[j] && x[i] == x[k]){
                        int area = Math.abs(x[i] - x[j]) * Math.abs(y[i] - y[k]);
                        ans = Math.max(ans, area);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

/*
4
0 0
0 1
1 0
1 2

 */


//https://dmoj.ca/problem/usaco20febb1