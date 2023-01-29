package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P08MrNAndPresents {
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
        int Q = readInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i <Q; i++){
            char F = readCharacter();
            int x = readInt();
            if(F == 'F') list.add(0,x);
            else if (F == 'E') list.add(x);
            else if (F == 'R') list.remove(x);
        }
        System.out.println(String.valueOf(list));
    }
}

/*
5
F 1
F 2
R 1
E 3
E 1

 */
