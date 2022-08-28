package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MEDIANMARK {
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
        int[] marks = new int[N];
        for(int i = 0 ; i < N; i++){
           marks[i] = readInt();
        }
        Arrays.sort(marks);

        if(N % 2 == 0){
            System.out.println(Math.round((marks[N/2] + marks[N/2-1]) / 2.0d));
        }
        else System.out.println(marks[N/2]);
    }
}
/*
2
50
100

 */

/*
3
40
99
100

 */