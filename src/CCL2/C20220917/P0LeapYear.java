package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P0LeapYear {
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
        int T = readInt();
        for(int i = 0; i < T; i++){
            int Y = readInt();
            if(Y % 4 == 0 && Y % 100 != 0) System.out.println("1");
            else if(Y % 400 == 0) System.out.println("1");
            else System.out.println("0");
        }
    }
}
 /*
4
0
4
100
400

  */


//https://dmoj.ca/problem/p307ex9