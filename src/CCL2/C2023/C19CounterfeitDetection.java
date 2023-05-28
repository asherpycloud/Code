package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C19CounterfeitDetection {
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
        String in = next();
        int cnt = 0;
        for(int i = 0; i < in.length(); i++){
            if(i != in.length()-1) if(in.charAt(i) == '2' && in.charAt(i+1) != '5') cnt++;
            if(i == in.length()-1) if(in.charAt(i) == '2') cnt++;
        }
        System.out.println(cnt);
    }
}

/*
2256624425252

 */