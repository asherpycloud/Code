package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P07TimeOnTask {
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
        int T = readInt();
        int C = readInt();
        int[] tasks = new int[C];
        for(int i = 0 ; i <C; i++){
            tasks[i] = readInt();
        }
        Arrays.sort(tasks);
        int cnt = 0;
        int task = 0;
        for(int i = 0; i<C; i++){
           task = task + tasks[i];
           if(task>T) break;
           else cnt++;
        }
        System.out.println(cnt);
    }
}

/*
6
3
3
6
3

 */

/*
6
5
5
4
3
2
1

 */


//https://dmoj.ca/problem/ccc13j4