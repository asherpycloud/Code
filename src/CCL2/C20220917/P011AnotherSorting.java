package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P011AnotherSorting {
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
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    public static void main(String[] args) throws IOException{
        int N = readInt();
        Integer[] digits = new Integer[N];
        for(int i = 0 ;i <N; i++){
            digits[i] = readInt();
        }
        Arrays.sort(digits, new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {
                int au = a % 10, bu = b % 10;
                if(au == bu){
                    return b - a;
                }else{
                    return au-bu;
                }
            }
        });
        for(int i = 0 ; i<N; i++){
            System.out.print(digits[i] + " ");
        }
    }
}
