package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C02idk {
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
        int n = readInt(), desire[] = new int[n+1], delta[] =  new int[n+2];
        for(int i =1; i <=n; i++){
            desire[i] = readInt();
        }
        for(int i = 1; i <n; i++){
            delta[i] = delta[i] - delta[i-1];
        }
        int dif[] = new int[n+2], ans = 0;
        for(int i =1; i<=n+1;i++){
            dif[i] = delta[i] - delta[i-1];
            if(dif[i] > 0) ans += dif[i];
        }
        System.out.println(ans);
    }
}
