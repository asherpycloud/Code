package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C18HomeRow {
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
        String s = next(), t = next();
        int cnt = 0;
        for(int i = 0; i < s.length() && i < s.length() && i < t.length(); i++){
            if(s.charAt(i) == t.charAt(i)) cnt++;
            else break;
        }
        System.out.println((s.length() - cnt) + (t.length() - cnt));
    }
}


/*
adachi
shimamura

 */

/*
shinomiya
shirogane

 */