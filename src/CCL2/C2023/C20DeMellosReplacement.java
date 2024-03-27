package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C20DeMellosReplacement {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static long M = (long)Math.pow(10, 9) + 7;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    static Long readLong() throws IOException {
        return Long.parseLong(next());
    }
    public static void main(String[] args) throws IOException{
        long N = readInt(), P = readInt(), max = 0, min = Integer.MAX_VALUE;
        String biggest = "", smallest = "";
        for(int i = 0; i < N; i++){
            String n = next();
            int M = readInt(), C = readInt(), E = readInt();
            long mark = (long)(4 * Math.sqrt(M)) + (3 * (long)Math.pow(C, P)) - (4 * E);
            if(mark > max){
                max = mark;
                biggest = n;
            }
            if(mark < min){
                min = mark;
                smallest = n;
            }
        }
        System.out.println(biggest + " " + max);
        System.out.println(smallest + " " + min);
    }
}


/*
3 2
Zain 98 99 96
Max 92 100 2
Ethan 34 57 58
 */