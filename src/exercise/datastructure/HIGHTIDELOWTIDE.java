package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HIGHTIDELOWTIDE {
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
        int[] tides = new int[N];
        for(int i = 0; i<N; i++){
            tides[i] = readInt();
        }
        Arrays.sort(tides);
        if(N % 2 == 0) {
            for (int i = N / 2 - 1; i >= 0; i--) {
                System.out.print(tides[i] + " " + tides[N - i - 1] + " ");
            }
        }else{
            for(int i = N/2; i>0; i--){
                System.out.print(tides[i] + " " + tides[N - i] + " ");
            }
            System.out.print(tides[0]);
        }
    }
}
