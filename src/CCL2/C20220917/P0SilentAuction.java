package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P0SilentAuction {
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
        String winner = "";
        int highBid = 0;
        for (int i = 0; i < N; i++) {
            String bidder = next();
            int bid = readInt();
            if (bid > highBid) {
                highBid = bid;
                winner = bidder;
            }
        }
        System.out.println(winner);
    }
}

/*
3
Ahmed
300
Suzanne
500
Ivona
450

 */

/*
2
Ijeoma
20
Goor
20

 */


//https://dmoj.ca/problem/ccc21j2