package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5SpecialDay {
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
    	int M = readInt();
    	int D = readInt();
    	if(M == 2 && D == 18) System.out.println("Special");
    	else if(M < 2) System.out.println("Before");
    	else if(M == 2 && D < 18) System.out.println("Before");
    	else if(M == 2 && D > 18) System.out.println("After");
    	else if(M >2) System.out.println("After");
    }
}

/*
1
7

*/

/*
8
31

 */

/*
2
18

 */


//https://dmoj.ca/problem/ccc15j1
