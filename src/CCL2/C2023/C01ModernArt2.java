package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C01ModernArt2 {
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
        int M = readInt();
        int N = readInt();
        boolean[] row = new boolean[M];
        boolean[] column = new boolean[N];
        int K = readInt();
        int m = 0;
        int n = 0;
        for(int i = 0 ;i <K; i++){
            String d = next();
            int x = readInt() - 1;
            if(d.equals("R")){
                if(row[x]){
                    row[x] = false;
                    m--;
                }else{
                    row[x] = true;
                    m++;
                }
            }else{
                if(column[x]){
                    column[x] = false;
                    n--;
                }else{
                    column[x] = true;
                    n++;
                }
            }
        }
        System.out.println(m*N + M*n - 2*m*n);
    }
}
