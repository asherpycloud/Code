package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P08IconScaling {
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
        char[][] icon = {{'*', 'x', '*'}, {' ', 'x', 'x'}, {'*', ' ', '*'}};
        int n = readInt();
        char[] line = new char[3*n];
        for(int r = 0 ; r<3; r++){
            for(int c = 0; c<3; c++){
               for(int k = 0; k<n; k++){
                   line[c*n+k] = icon[r][c];
               }
            }
            for(int k = 0; k<n; k++){
                System.out.println(line);
            }
        }
    }
}


//https://dmoj.ca/problem/ccc12j3