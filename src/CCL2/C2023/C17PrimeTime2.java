package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C17PrimeTime2 {
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
        for(int t = 0; t < 5; t++){
            int n = readInt(), cnt[] = new int[n+1];
            for(int i = 2; i <= n; i++){
                int x = i;
                for(int k = 2; k*k <= x; k++){
                    while(x % k == 0){
                        cnt[k]++;
                        x /= k;
                    }
                }
                if(x!=1) cnt[x]++;
            }
            boolean first = false;
            for(int i = 2; i <= n; i++){
                if(cnt[i] == 0) continue;
                if(first) System.out.print(" * " + i + "^" + cnt[i]);
                else{
                    System.out.print(i + "^" + cnt[i]);
                    first = true;
                }
            }
            System.out.println();
        }
    }
}
