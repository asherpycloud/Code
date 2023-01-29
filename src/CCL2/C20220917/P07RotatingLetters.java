package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P07RotatingLetters {
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
        String word = next();
        boolean rotate = false;
        for(int i = 0; i<word.length();i++){
            String n = word.substring(i, i+1);
            if(n.equals("I") || n.equals("O") || n.equals("S") || n.equals("H") || n.equals("Z") || n.equals("X") || n.equals("N")){
                rotate = true;
            } else {
                rotate = false;
                break;
            }
        }
        if(!rotate) System.out.println("NO");
        else System.out.println("YES");
    }
}

/*
SHINS

 */

/*
NOISE

 */


//https://dmoj.ca/problem/ccc13j2