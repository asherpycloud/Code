package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P06GoodTimes {
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
        int X = readInt();
        String[] x1 = new String[X], x2 = new String[X];
        for(int i =0 ;i<X; i++){
            x1[i] = next(); x2[i] = next();
        }
        int Y = readInt();
        String[] y1 = new String[Y], y2 = new String[Y];
        for(int i =0; i<Y;i++){
            y1[i] = next(); y2[i] = next();
        }
        int G = readInt(); Map<String, Integer> map = new HashMap<>();
        for(int i =1; i<= G; i++){
            String a = next(), b = next(), c = next();
            map.put(a, i); map.put(b, i); map.put(c, i);
        }
        int ans = 0;
        for(int i =0; i <X; i++){
            if(map.get(x1[i]) != map.get(x2[i])) ans++;
        }
        for(int i =0; i <Y;i++){
            int va = map.getOrDefault(y1[i], 0), vb = map.getOrDefault(y2[i], 0);
            if(va == vb && va>=1 && va<=G) ans++;
        }
        System.out.println(ans);
    }
}

/*
1
ELODIE CHI
0
2
DWAYNE BEN ANJALI
CHI FRANCOIS ELODIE

 */

/*
3
A B
G L
J K
2
D F
D G
4
A C G
B D F
E H I
J K L

 */

//https://dmoj.ca/problem/ccc22s2