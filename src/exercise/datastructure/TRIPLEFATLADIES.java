package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TRIPLEFATLADIES {
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
        int t = readInt();
        for(int i = 0; i <t; i++){
            int k = readInt();
            if(k<=192) System.out.println(192);
            else{
                long start = k /10 * 10 + 12;
                while(true){
                    if(((start*start*start) -888) % 1000 == 0){
                        System.out.println(start);
                        break;
                    }else{
                        start += 10;
                    }
                }
            }
        }
    }
}
