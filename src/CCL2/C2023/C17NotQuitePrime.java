package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C17NotQuitePrime {
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
        for(int q = 0; q < 5; q++) {
            int n = readInt(), d = 0;
            boolean check = false;
            for(int i = 2; i * i <= n; i++){
                if (n % i == 0) check = true;
            }

            if (check == false){
                boolean semians = false;
                for (int i = 2; i <= n - 1; i++) {
                    if (n % i != 0 && d == 0) semians = false;
                    else if (n % i != 0 && d != 0) semians = false;
                    else if (n % i == 0 && d == 0) {
                        semians = true;
                        d = i;
                    } else if (n % i == 0 && d != 0) semians = false;
                }
                boolean semiprime = false;
                if (semians == true) for (int i = 2; i * i <= n; i++) if (n % i == 0) semiprime = true;
                if (semiprime == true) System.out.println("semiprime");
            }else System.out.println("not");
        }
    }
}

/*
2
3
4
5
6

 */
