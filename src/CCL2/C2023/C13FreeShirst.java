package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C13FreeShirst {
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
        for(int i = 0; i<10; i++) {
            int N = readInt(), M = readInt(), D = readInt();
            int[] S = new int[D];
            int[] CS = new int[D];
            int[] A = new int[D];
            for(int j = 0; j<M; j++){
                A[readInt()-1]++;
            }
            int cnt = 0;
            for(int j = 0; j<D; j++) { // no event shirt
                if(A[j] == 0 && CS[j] != 0) {
                    S[j] = N;
                    CS[j] = S[j] - 1;
                } else if(A[j] == 0 && CS[j] == 0){ //no event no shirt
                    S[j] = N;
                    CS[j] = N-1;
                    cnt++;
                } else if(A[j] !=0 && CS[j] != 0){ //event shirt
                    N = N++;
                    S[j] = N;
                } else if(A[j] !=0 && CS[j] == 0){ //event no shirt
                    CS[j] = N;
                    N = N++;
                    S[j] = N;
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}

/*
1 1 10
10
1 3 10
2 9 5

 */