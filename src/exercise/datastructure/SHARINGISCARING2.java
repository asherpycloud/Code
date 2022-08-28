package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SHARINGISCARING2 {
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
    public static void main(String[] arsg) throws IOException{
        int N = readInt();
        int M = readInt();
        String[][] googol = new String[M][3];
        for(int i = 0; i<M; i++){
            googol[i][0] = next();
            googol[i][1] = next().trim();
            googol[i][2] = br.readLine();
        }
        String Y = br.readLine();
        for(int i = 0; i < M; i++){
            if(googol[i][1].equals(Y)) System.out.println(googol[i][2]);
        }
    }
}

/*
3 3
1 2
Road to Becoming a Philosopher
2 3
Hello, World
3 2
Untitled Document
2

 */
