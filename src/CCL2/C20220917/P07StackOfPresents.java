package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P07StackOfPresents {
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
    public static void main(String[] args)throws IOException{
        int N = readInt();
        int[] present = new int[N];
        for(int i =0  ; i < N ; i++){
            present[i] = readInt();
        }
        Arrays.sort(present);
        int sum = 0;
        int cnt = 0;
        for(int i =0 ; i <N; i++){
            if(present[i] >= sum){
                sum = sum + present[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

/*
5
7
8
2
5
10

 */


//https://dmoj.ca/problem/tle16c4p1