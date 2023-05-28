package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C17PasswordAnger {
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
    static int n, m, cnt;
    public static void main(String[] args) throws IOException{
        n = readInt(); m = readInt();
        fun(1, "");
        System.out.println(cnt);
    }
    static void fun(int lvl, String s){
        if(lvl > n){
            if(get_hash(s) == m) cnt++;
            return;
        }
        for(char c = 'a'; c<= 'z'; c++) fun(lvl+1, s+c);
    }
    static int get_hash(String s){
        int hash = 0;
        for(int i = 0; i < s.length(); i++){
            hash = hash * 13 + s.charAt(i) - 'a' + 1;
        }
        return hash;
    }
}
