package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C11IOI11 {
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
        String password = next();
        char letter;
        for(int i = 0 ; i<password.length(); i++){
            letter = password.charAt(i);
            if(letter == '0') System.out.print("O");
            else if(letter == '1') System.out.print("l");
            else if(letter == '3') System.out.print("E");
            else if(letter == '4') System.out.print("A");
            else if(letter == '5') System.out.print("S");
            else if(letter == '6') System.out.print("G");
            else if(letter == '8') System.out.print("B");
            else if(letter == '9') System.out.print("g");
            else System.out.print(letter);
        }
    }
}

/*
y0105w49

 */
