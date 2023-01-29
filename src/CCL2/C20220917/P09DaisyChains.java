package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P09DaisyChains {
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
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    public static void main(String[] args) throws IOException{
        int n = readInt(), a[] = new int[n];
        for(int i =0 ;i <n; i++){
            a[i] = readInt();
        }
        int ans = 0;
        for(int i =0; i <n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum += a[j];
                for(int k = i; k<=j; k++){
                    if(a[k] * (j - i + 1) == sum){
                        ans++; break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
