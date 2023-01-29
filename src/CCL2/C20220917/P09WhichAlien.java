package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P09WhichAlien {
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
    public static void main(String[] args) throws IOException {
        int a = readInt();
        int e = readInt();
        if(a >= 3 &&  e <=4) System.out.println("TroyMartian");
        if(a <= 6 && e >= 2) System.out.println("VladSaturnian");
        if(a<=2 && e <= 3) System.out.println("GraemeMercurian");
    }
}
