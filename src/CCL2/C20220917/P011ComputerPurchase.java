package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P011ComputerPurchase {
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
        int n = readInt();
        int max = 0; String B = "";
        int max2 = 0; String B2 = "";
        for(int i =0 ; i <n; i++) {
            String cmp = next();
            int R = readInt(), S = readInt(), D = readInt();
            int v = 2*R + 3*S + D;
            if((v > max) || (v == max && cmp.compareTo(B) < 0)){ //if new ranking is better than the best ranking
                max2 = max;
                max = v;
                B2 = B;
                B = cmp;
            }else if((v > max2) || (v == max2 && cmp.compareTo(B2) < 0)){ //if rankings are equal
                max2 = v;
                B2 = cmp;
            }else if(n == 0) System.out.println(cmp);
        }
        System.out.println(B + "\n" + B2);
    }
}
