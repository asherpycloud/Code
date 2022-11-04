package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P0BoilingWater {
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
    public static void main(String[] args)throws IOException{
        int B = readInt();
        int P =  5 * B - 400;
        System.out.println(P);
        if(P == 100) System.out.println(0);
        else if(P > 100) System.out.println(-1);
        else System.out.println(1);
    }
}

/*
99

 */


//https://dmoj.ca/problem/ccc21j1