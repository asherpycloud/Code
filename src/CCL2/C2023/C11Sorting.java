package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C11Sorting {
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
        int K = readInt();
        int[] P = new int[N];
        for(int i = 0 ;i < N; i++){
            P[i] = readInt();
        }
        boolean yes = false;
        for(int i = 0 ;i <N; i++){
            if((P[i] - (i+1)) % K == 0) yes = true;
            else{
                yes = false;
                break;
            }
        }
        if(yes == true) System.out.println("YES");
        else System.out.println("NO");
    }
}


/*
5 1
1 4 3 2 5

 */

/*
5 2
5 4 3 2 1

 */

/*
5 3
5 4 3 2 1

 */