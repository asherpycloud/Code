package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NEWSTUDENTS {
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
        int I = readInt();
        int mark;
        ArrayList<Integer> marks = new ArrayList<>();
        for(int i = 0; i < I; i++){
            mark = readInt();
            marks.add(mark);
        }
        int S = readInt();
        for(int i = 0 ; i < S; i++){
            mark = readInt();
            marks.add(mark);
        }

        int[] psa = new int[marks.size() + 1];
        for(int i = 1; i< marks.size() + 1; i++){
            psa[i] = psa[i-1] + marks.get(i-1);
            if(i>I) System.out.printf("%.3f \n", 1.0f * psa[i] / i);
        }
    }
}
/*
2
50
80
2
100
26

 */
