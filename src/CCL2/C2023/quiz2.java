package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class quiz2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static long M = (long)Math.pow(10, 9) + 7;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException{
        int N = readInt(), K = readInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = readInt();
        }

        int sum = 0, cnt = 0;
        Arrays.sort(A);
        for(int i = 0; i < N; i++){
            sum += A[i];
            if(sum >= K) break;
            else cnt++;
        }

        if(cnt != 0)System.out.println(cnt);
        else System.out.println(-1);
    }
}

/*
6 40
6
18
11
13
19
11

 */