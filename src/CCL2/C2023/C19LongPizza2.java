package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C19LongPizza2 {
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
        int N = readInt(), x = readInt(), y = readInt(), R = readInt();
        long sum = 0;
        for(int i = 0; i <R; i++){
            int l = readInt(), r = readInt();
            int olap = overlap(x, y, l, r);
            sum += olap;
        }
        System.out.println(sum);
    }

    static int overlap(int x, int y, int l, int r){
        int s = Math.max(x, l);
        int e = Math.min(y, r);
        if(e >= s) return e-s+1;
        else return 0;
    }
}
