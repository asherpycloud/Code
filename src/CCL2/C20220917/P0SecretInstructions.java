package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P0SecretInstructions {
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
        String num = next();
        String dir = "";
        while(!num.equals("99999")){
            int num1 = Integer.parseInt(num.substring(0,1));
            int num2 = Integer.parseInt(num.substring(1,2));
            int steps = Integer.parseInt(num.substring(2));
            if(num1 + num2 == 0){
                System.out.println(dir + " " + steps);
            } else if((num1 + num2) % 2 == 1){
                dir = "left";
                System.out.println(dir + " " + steps);
            } else if((num1 + num2) % 2 == 0){
                dir = "right";
                System.out.println(dir + " " + steps);
            }
            num = next();
        }
    }
}

/*
57234
00907
34100
99999

 */

//https://dmoj.ca/problem/ccc21j3