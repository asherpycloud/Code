package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P0Voting {
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
        int N = readInt();
        int[] votes = new int[7];
        for(int i = 0; i < N; i++){
            char C = next().charAt(0);
            if(C == 'A') votes[0]++;
            else if(C == 'B') votes[1]++;
            else if(C == 'C') votes[2]++;
            else if(C == 'D') votes[3]++;
            else if(C == 'E') votes[4]++;
            else if(C == 'F') votes[5]++;
            else votes[6]++;
        }
        for(int i = 0; i < 7; i++){
            System.out.println(votes[i]);
        }
    }
}
/*
5
A
B
C
B
%

 */


//https://dmoj.ca/problem/p184ex8