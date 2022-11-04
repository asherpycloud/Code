package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1WinningScore {
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
        int A = 0;
        int B = 0;
        for(int i = 3 ; i >0; i--){
            int score = readInt();
            A = A + (score * i);
        }
        for(int i = 3; i>0; i--){
            int score = readInt();
            B = B + (score * i);
        }
        if(A > B) System.out.println("A");
        else if (A < B) System.out.println("B");
        else System.out.println("T");
    }
}

/*
10
3
7
8
9
6

 */

/*
7
3
0
6
4
1

 */

/*
7
3
0
6
4
1

 */
//https://dmoj.ca/problem/ccc19j1