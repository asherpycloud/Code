package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C01BattlePositions2 {
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
        int I = readInt();
        int[] stations = new int[I];
        int N = readInt();
        int J = readInt();
        int X1, X2, K;
        for(int i = 0; i <J; i++){
            X1 = readInt() - 1;
            X2 = readInt();
            K = readInt();
            stations[X1]+=K;
            if(X2<J) stations[X2]-=K;
        }
        int cnt = 0;
        if(stations[0] <N) cnt++;
        for(int i = 1; i < I; i++){
            stations[i] = stations[i-1] + stations[i];
            if(stations[i] < N) cnt++;
        }
        System.out.println(cnt);
    }
}

/*
4
1
3
1 3 1
2 3 2
3 4 2

 */