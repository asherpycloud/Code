package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C19ModuloSort {
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
        int N = readInt(), K = readInt();
        Unit[] arr = new Unit[N];
        for(int i = 0 ; i < N; i++){
            int x = readInt();
            arr[i] = new Unit(x, K);
        }
        Arrays.sort(arr);
        System.out.print(arr[0].x);
        for(int i = 1; i < N; i++){
            System.out.print(" " + arr[i].x);
        }
        System.out.println();
    }

    static class Unit implements Comparable<Unit>{
        int x, m;
        Unit(int px, int k) {
            this.x = px;
            this.m = px % k;
        }
        public int compareTo(Unit u) {
            if (this.m == u.m) return this.x - u.x;
            else return this.m - u.m;
        }
    }
}


/*
4
4
68 19 14 62

 */

/*
8
4
1 18 21 27 17 4 4 16

 */