package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C18ABC {
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
        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[3];

        for(int i = 0; i < 3; i++){
            int[] arr = (i == 0) ? A : ((i == 1) ? B :  C);
            for(int j = 0; j < 3; j++){
                arr[j] = readInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < 3; i++){
            int ai = i-1;
            if(ai < 0) ai = 2;
            if(B[i] == A[ai] && C[i] > 0){
                sum += C[i];
            }
        }
        System.out.println(sum);
    }
}

/*
5 6 5
6 5 6
6 1 4

 */