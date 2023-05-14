package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C15TakeANumber {
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
        int N = readInt();
        int Lcnt = 0, Scnt = 0;
        String word = next();
        while(!word.equals("EOF")){
            if(word.equals("TAKE")){
                N++;
                if(N==1000) N=1;
                Lcnt++;
            }else if(word.equals("SERVE")){
                Scnt++;
            }else if(word.equals("CLOSE")){
                System.out.println(Lcnt + " " + (Lcnt - Scnt) + " " + N);
                Lcnt = 0;
                Scnt = 0;
            }
            word = next();
        }
    }
}

/*
23
TAKE
TAKE
SERVE
TAKE
SERVE
SERVE
CLOSE
TAKE
TAKE
TAKE
SERVE
CLOSE
TAKE
SERVE
TAKE
SERVE
TAKE
TAKE
TAKE
TAKE
TAKE
TAKE
SERVE
CLOSE
EOF

 */