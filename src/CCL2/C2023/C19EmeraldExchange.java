package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C19EmeraldExchange {
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
        int N = readInt(), sum = 0, max = 0;
        for(int i = 0; i < N; i++){
            int x = readInt();
            if(x % 2 == 0){
                sum += x;
                if(sum > max) max = sum;
            }else {
                sum = 0;
            }
        }
        System.out.println(max);
    }
}

/*
13
2 3 4 4 5 6 1 2 2 2 1 8 2

 */
