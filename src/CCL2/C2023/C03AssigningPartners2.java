package CCL2.C2023;

import java.io.*;
import java.util.*;

public class C03AssigningPartners2 {
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
        int N = readInt();
        if (N % 2 != 0) System.out.println("bad");
        else {
            String[] att = new String[N];
            String[] part = new String[N];
            for (int i = 0; i < N; i++) att[i] = next();
            for (int i = 0; i < N; i++) part[i] = next();
            HashMap map = new HashMap<String,String>();
            for (int i = 0; i < N; i++) {
                if(map.containsKey(att[i])) {
                    if(! map.get(att[i]).equals(part[i])) {
                        System.out.println("bad");
                        System.exit(-1);
                    }
                } else if(map.containsKey(part[i])) {
                    if(! map.get(part[i]).equals(att[i])) {
                        System.out.println("bad");
                        System.exit(-1);
                    }
                }else {
                    map.put(att[i], part[i]);
                    map.put(part[i], att[i]);
                }
            }
            System.out.println("good");
        }
    }
}

/*
4
Ada Alan Grace John
John Grace Alan Ada

 */

/*
7
Rich Graeme Michelle Sandy Vlado Ron Jacob
Ron Vlado Sandy Michelle Rich Graeme Jacob

 */
