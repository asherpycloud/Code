package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P08SoundsFishy {
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
        int[] alarm = new int[4];
        for(int i = 0 ;i  <4; i++) {
            alarm[i] = readInt();
        }
        if(alarm[0]< alarm[1] && alarm[1]< alarm[2] && alarm[2]< alarm[3])System.out.println("Fish Rising");
        else if(alarm[3]< alarm[2] && alarm[2]< alarm[1] && alarm[1]< alarm[0])System.out.println("Fish Diving");
        else if (alarm[3] == alarm[2] && alarm[2] == alarm[1] && alarm[1] == alarm[0]) System.out.println("Fish At Constant Depth");
        else System.out.println("No Fish");
    }
}

/*
30
10
20
20

 */

/*
1
10
12
13

 */


//https://dmoj.ca/problem/ccc12j2