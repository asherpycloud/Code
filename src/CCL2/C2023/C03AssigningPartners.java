package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C03AssigningPartners {
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
    public static void main(String[] args) throws IOException {
        int N = readInt();
        if (N % 2 != 0) System.out.println("bad");
        else {
            String[] att = new String[N];
            String[] part = new String[N];
            for (int i = 0; i < N; i++) {
                att[i] = next();
            }
            for (int i = N - 1; i >= 0; i--) {
                part[i] = next();
            }
            boolean yes = true;
            for (int i = 0; i < N; i++) {
                if (att[i].equals(part[i])){
                    yes = true;
                }
                else {
                    System.out.println("bad");
                    break;
                }
            }
            if (yes) System.out.println("good");
        }
    }
}

/*
4
Ada Alan Grace John
John Grace Alan Ada

 */

/*
7
Rich Graeme Michelle Sandy Vlado Ron Jacob
Ron Vlado Sandy Michelle Rich Graeme Jacob

 */
