package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P5WaitTime {
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
        int m = readInt(), t = 0, rec[] = new int[101], wait[] = new int[101];
        Arrays.fill(rec,1);
        for(int i =1; i <=m; i++){
            char op = readCharacter(); int x = readInt();
            if(op == 'R'){
                rec[x] = t;
                t++;
            } else if(op == 'S'){
                wait[x] += t - rec[x];
                rec[x] = -1;
                t++;
            } else if(op == 'W'){
                t = t + x - 1;
            }
        }
        for(int i = 1; i<wait.length;i++){
            if(rec[i] != 1){
                System.out.println(i + " -1");
            } else if(wait[i] > 0){
                System.out.println(i+ " " + wait[i]);
            }
        }
    }
}

/*
5
R 2
R 3
W 5
S 2
S 3

 */