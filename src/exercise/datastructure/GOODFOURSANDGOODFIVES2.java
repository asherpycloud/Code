package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GOODFOURSANDGOODFIVES2 {
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
        int cnt = 0;
        if(N>20){
            cnt = (int)Math.pow(2.0, 1.0 * N/20);
            N = N%20;
        }
        if(N % 4 == 0 || N%5 == 0) cnt++;
        else{
            if(N % 4 == 0) cnt++;
            if(N % 5 == 0) cnt++;
            while(N>5){
                N = N - 4;
                if(N % 5 == 0) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
