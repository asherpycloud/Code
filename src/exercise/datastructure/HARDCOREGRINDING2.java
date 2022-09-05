package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HARDCOREGRINDING2 {
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
        int[] diff = new int[10000000 + 3];
        for(int i = 0 ; i < N; i++){
            int s = readInt();
            int f = readInt();
            diff[s]++;
            diff[f]--;
        }
        int max = 0;
        for(int i = 1; i<diff.length; i++){
            diff[i] = diff[i] + diff[i-1];
            max = Math.max(diff[i], max);
        }
        System.out.println(max);
    }
}
/*
7
1 3
1 4
2 5
3 7
4 7
6 9
7 8

 */