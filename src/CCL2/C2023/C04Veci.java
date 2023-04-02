package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C04Veci {
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
        int x = readInt();
        for(int i = x+1; i <1e6; i++){
            char[] a = Integer.toString(i).toCharArray();
            char[] b = Integer.toString(x).toCharArray();
            Arrays.sort(a); Arrays.sort(b);
            if(Arrays.equals(a,b)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
