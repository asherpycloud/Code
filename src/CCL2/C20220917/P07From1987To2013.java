package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P07From1987To2013 {
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
        int Y = readInt();
        while(true){
            Y++;
            boolean[] year = new boolean[10];
            String str = String.valueOf(Y);
            boolean valid = true;
            for(int i = 0; i<str.length(); i++){
                int j = str.charAt(i) - '0';
                if(!year[j]){
                    year[j] = true;
                }else{
                    valid = false;
                    break;
                }
            }
            if(valid)break;
        }
        System.out.println(Y);
    }
}

/*
1987

 */

/*
999

 */