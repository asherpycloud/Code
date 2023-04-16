package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C011SnowCall {
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
        int n = readInt();
        for(int i = 0; i < n; i++){
            String number = next();
            for(int j = 0, k = 0; j < 12 && k < number.length(); j++, k++){
                char c = number.charAt(k);
                if ((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                    if("ABC".indexOf(c) >= 0) System.out.print("2");
                    else if("DEF".indexOf(c) >= 0) System.out.print("3");
                    else if("GHI".indexOf(c) >= 0) System.out.print("4");
                    else if("JKL".indexOf(c) >= 0) System.out.print("5");
                    else if("MNO".indexOf(c) >= 0) System.out.print("6");
                    else if("PQRS".indexOf(c) >= 0) System.out.print("7");
                    else if("TUV".indexOf(c) >= 0) System.out.print("8");
                    else if("WXYZ".indexOf(c) >= 0) System.out.print("9");
                    else if(c >= '0' && c <= '9') System.out.print(c);
                    if(j == 2 || j == 5) System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}

/*
5
88-SNOW-5555
519-888-4567
BUY-MORE-POP
416-PIZZA-BOX
5059381123

 */