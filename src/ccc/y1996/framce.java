package ccc.y1996;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class framce {
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
        int H = readInt();
        int W = readInt();
        for(int i = 0 ; i <W+2; i++) {
            System.out.print("#");
        }
        System.out.println();
        for(int i = 0; i <H; i++){
            String img = next();
            System.out.println("#" + img + "#");
        }
        for(int i = 0 ; i <W+2; i++) {
            System.out.print("#");
        }
    }
}
/*
2 3
abc
ccc

 */

/*
1 1
a

 */