package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C15LSystemsGo {
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
        int R = readInt(), t = readInt();
        String a = next();
        int[][] game = new int[R][R];
        for(int i = 0; i < R; i++){
            String s1 = next();
            String s2 = next();
            int r = s1.charAt(0) - 'A';
            for(int j = 0; j < s2.length(); j++){
                int c = s2.charAt(j) - 'A';
                game[r][c]++;
            }
        }
        int[] cnts = new int[R];
        for(int j = 0; j < a.length(); j++){
            int c = a.charAt(j) - 'A';
            cnts[c]++;
        }
        for(int i = 0; i < t; i++){
            int[] newCnts = new int[R];
            for(int j = 0; j<R; j++){
                if(cnts[j] > 0){
                    for(int k = 0; k<R; k++){
                        if(game[j][k] > 0)
                            newCnts[k] += cnts[j] * game[j][k];
                    }
                }
            }
            cnts = newCnts;
        }
        int len = 0;
        for (int i =0; i<R; i++) len += cnts[i];
        System.out.println(len);
    }
}

/*
3 5 AC
A CAB
B CB
C ACB
4 5 AD
A AC
B ACA
C BD
D B

 */