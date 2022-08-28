package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LETTERFREQUENCY2 {
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
        String S = br.readLine();
        int Q = readInt();
        int[] index = new int[S.length()];
        int[] alph = new int[26];
        for(int i = 0; i <26; i++) alph[i] = -1;
        for(int i = 0; i<S.length(); i++){
            char chr = S.charAt(i);
            if(chr >= 'a' && chr <= 'z') {
                int pos = chr - 'a';
                index[i] = alph[pos];
                alph[pos] = i;
            }
        }
        for(int i = 0; i<Q; i++){
            int ii = readInt()-1;
            int jj = readInt()-1;
            char c = next().charAt(0);
            int cnt = 0;
            for(int j = jj; j>=ii;){
                if(S.charAt(j) == c){
                    cnt++;
                    j = index[j];
                }else j--;
            }
            System.out.println(cnt);
        }
    }
}
