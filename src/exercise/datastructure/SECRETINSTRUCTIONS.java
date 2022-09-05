package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SECRETINSTRUCTIONS {
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
        String last = "";
        while(!input.equals("99999")){
            int d1 = input.charAt(0) - '0';
            int d2 = input.charAt(1) - '0';
            int num = Integer.valueOf(input.substring(2));
            if((d1 + d2) % 2 == 1){
                last = "left";
                System.out.println(last + " " + num);
            } else if((d1 + d2) % 2 == 0 && (d1+d2) != 0){
                last = "right";
                System.out.println(last + " " + num);
            } else if((d1+d2) == 0){
                System.out.println(last + " " + num);
            }
            input = next();
        }
    }
}
/*
57234
00907
34100
99999

 */
