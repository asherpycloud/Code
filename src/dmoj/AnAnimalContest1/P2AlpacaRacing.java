package dmoj.AnAnimalContest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2AlpacaRacing {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException{
        int N = readInt();
        long D = readLong();
        int K = readInt();
        int X = readInt();
        long[] a = new long[N];
        for(int i = 0 ; i <N; i++){
            a[i] = readLong();
        }
        long P = readLong();
        double factor = 1.0* (100-X)/100;
        for(int i = 0; i <N; i++){
            long speed = (long) a[i];
            while(speed>=P && K>0){
                speed*=factor;
                K--;
            }
            if(speed>=P){
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}

/*
2 12 3 30
100
50
50

 */

/*
4 200 1 1
1000
12
2134
22
1

 */