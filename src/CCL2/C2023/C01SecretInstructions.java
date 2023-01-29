package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C01SecretInstructions {
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
    public static void main(String[]args) throws IOException{
        int in = readInt();
        String prev = "";
        while(in != 99999){
            int f = in/10000;
            int s = (in/1000)%10;
            if((f + s) % 2 == 0 && f+s != 0){
                System.out.println("right " + in % 1000);
                prev = "right ";
            }
            else if((f + s) % 2 == 1){
                System.out.println("left " + in % 1000);
                prev = "left ";
            }
            else if((f + s) == 0){
                System.out.println(prev + in % 1000);
            }
            in = readInt();
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