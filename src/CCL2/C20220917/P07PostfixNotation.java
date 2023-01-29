package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P07PostfixNotation {
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
        st = new StringTokenizer(br.readLine().trim());
        double num1 = Double.valueOf(st.nextToken());
        while (st.hasMoreTokens()) {
            double num2 = Double.valueOf(st.nextToken());
            String eq = st.nextToken();
            if(eq.equals("*")) num1 = num1 * num2;
            else if (eq.equals("/")) num1 = num1 / num2;
            else if (eq.equals("+")) num1 = num1 + num2;
            else if (eq.equals("-")) num1 = num1 - num2;
            else if (eq.equals("%")) num1 = num1 % num2;
            else if (eq.equals("^")) num1 = Math.pow(num1, num2);
        }
        System.out.printf("%.1f\n", num1);
    }
}

/*
5 5 +

 */

/*
5 5 + 6 * 8 -

 */


//https://dmoj.ca/problem/postfix