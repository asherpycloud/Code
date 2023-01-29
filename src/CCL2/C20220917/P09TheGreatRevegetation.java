package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P09TheGreatRevegetation {
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
        int n = readInt(), m = readInt();
        List<ArrayList<Integer>> lst = new ArrayList<>();
        for(int i = 0; i<=n; i++){
            lst.add(new ArrayList<>());
        }
        for(int i = 0 ; i <m; i++){
            int a = readInt(), b = readInt();
            if(a> b) lst.get(a).add(b);
            else lst.get(b).add(a);
        }
        int ans[] = new int[n+1];
        for(int i = 1; i <= n; i++){
            for(int k = 1; k<=4; k++){
                boolean work = true;
                for(int x : lst.get(i)){
                    if(ans[x] == k) work = false;
                }
                if(work) {
                    ans[i] = k; break;
                }
            }
        }
        for(int i = 1; i<=n; i++)
            System.out.print(ans[i]);
    }
}
