package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5Mode {
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
    	int n = readInt();
    	int[] data = new int[1000];
    	while(n!= -1) {
    		data[n]++;
    		n = readInt();
    	}
    	int max = 0;
    	int mode = 0;
    	for(int i =0; i<1000; i++){
    	    if(data[i] > max) max = data[i];
    	  //  mode =
        }
    	System.out.println(mode);
    }
}

/*
2
3
4
4
-1

 */


//https://dmoj.ca/problem/p172ex8