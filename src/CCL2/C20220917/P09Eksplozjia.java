package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P09Eksplozjia {
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
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
    public static void main(String[] args) throws IOException{
        char[] s = readLine().toCharArray(), ex = readLine().toCharArray();
        char[] stk = new char[s.length]; int top = -1;
        for(int i = 0; i <s.length; i++){
            top++; stk[top] = s[i];
            if(top + 1 >= ex.length){
                boolean match = true;
                for(int k = 0; k<ex.length; k++){
                    if(stk[top-k] != ex[ex.length-1-k]){
                        match = false; break;
                    }
                }
                if(match) top -= ex.length;
            }
        }
        if(top <0) System.out.println("FRULA");
        else{
            for(int i =0 ; i<=top; i++){
                System.out.print(stk[i]);
            }
            System.out.println();
        }
    }
}

/*
mirkovC4nizCC44
C4

 */

/*
12ab112ab2ab
12ab

 */


//https://dmoj.ca/problem/coci13c5p3