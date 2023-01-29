package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P08SpeedFinesAreNotFine {
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
    public static void main(String[] args)throws IOException{
        int lim = readInt();
        int spe = readInt();
        if(spe <= lim) System.out.println("Congratulations, you are within the speed limit!");
        else {
            int dif = spe-lim;
            if(1 <= dif && dif <= 20) System.out.println("You are speeding and your fine is $100.");
            else if(21 <= dif && dif<= 30) System.out.println("You are speeding and your fine is $270.");
            else if(31 <= dif) System.out.println("You are speeding and your fine is $500.");
        }
    }
}

/*
40
39

 */

/*
100
131

 */

/*
100
120

 */


//https://dmoj.ca/problem/ccc12j1