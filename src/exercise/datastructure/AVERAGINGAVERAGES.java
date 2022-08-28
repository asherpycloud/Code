package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AVERAGINGAVERAGES {
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
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int Q = readInt();
        int[] marks = new int[N+3];
        int[] psa = new int[N+3];
        for(int i = 0; i < N; i++){
            marks[i] = readInt();
            if(i == 0) psa[i] = marks[i];
            else psa[i] = psa[i-1] + marks[i];
        }
        for(int i = 0; i <Q; i++){
            int a = readInt();
            int b = readInt();
            if(a == 0 && b > 0) System.out.println(psa[b-1] / (b-a+1));
            else if(a == 1 && b> 0) System.out.println(psa[b-1]/ (b-a+1));
            else {
                int A = (psa[b-1] - psa[a-2]) / (b-a+1);
                System.out.println(A);
            }
        }
    }
}
/*
5 3
100 50 0 75 90
1 2
2 3
2 5

 */