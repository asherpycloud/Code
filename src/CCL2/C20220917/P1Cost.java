package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1Cost {
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
        int T = readInt();
        for(int i = 0 ; i < T; i++){
            int N = readInt();
            if(0 <= N && N <= 30) System.out.println("38");
            else if(30 < N && N <= 50) System.out.println("55");
            else if(50 < N && N <= 100) System.out.println("73");

            if(100<N){
                int add = ((N-100)/50) * 24;
                if((N-100) % 50 != 0){
                    add += 24;
                }
                System.out.println(73+add);
            }
        }
    }
}

/*
2
5
101

 */


//https://dmoj.ca/problem/p108ex7