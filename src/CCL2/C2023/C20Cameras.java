package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C20Cameras {
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
    static Long readLong() throws IOException {
        return Long.parseLong(next());
    }
    public static void main(String[] args) throws IOException{
        int n = readInt(), k = readInt(), r = readInt();
        boolean[] houses = new boolean[n];
        for(int i = 0; i < k; i++){
            houses[readInt()-1] = true;
        }
        int addcnt = 0;
        int cnt = 0;
        for(int i = 0; i < r; i++){
            if(houses[i]) cnt++;
        }
        if(cnt < 2){
            addcnt++;
            for(int i = r-1; i >= 0; i--){
                if (!houses[i]){
                    houses[i] = true;
                    break;
                }
            }
        }
        for(int i = 0; i < n-1-r; i++){

        }
    }
}
