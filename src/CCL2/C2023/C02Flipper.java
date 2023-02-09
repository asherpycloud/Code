package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C02Flipper {
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
        String input = next();
        int[][] grid = {{1, 2}, {3, 4}};
        int tmp = 0;
        int cntH = 0, cntV = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'H') cntH++;
            else cntV++;
        }

        if (cntH % 2 == 1) {
            tmp = grid[0][0];
            grid[0][0] = grid[1][0];
            grid[1][0] = tmp;
            tmp = grid[0][1];
            grid[0][1] = grid[1][1];
            grid[1][1] = tmp;
        }
        if (cntV % 2 == 1) {
            tmp = grid[0][0];
            grid[0][0] = grid[0][1];
            grid[0][1] = tmp;
            tmp = grid[1][0];
            grid[1][0] = grid[1][1];
            grid[1][1] = tmp;
        }
        System.out.println(grid[0][0] + " " + grid[0][1]);
        System.out.println(grid[1][0] + " " + grid[1][1]);
    }
}

/*
HV

 */

/*
VVHH

 */


//https://dmoj.ca/problem/ccc19s1