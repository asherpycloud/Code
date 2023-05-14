package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C17PrimeTime {
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
        int[] in = new int[5];
        for(int t = 0; t<5; t++){
            in[t] = readInt();
        }
        Arrays.sort(in);
        int ind = 0;
        int[] cnt = new int[10001];
        for(int i = 2; i <= in[4]; i++){
            int y = (int)Math.sqrt(i);
            int n = i;
            for(int j=2; j<=y; j++){
                while(n % j == 0){
                    cnt[j]++;
                    n/=j;
                }
            }
            if(n != 1) cnt[n]++; //n is a prime so you have to count itself when prime factoring.
            if(i == in[ind]){
                System.out.print("2^" + cnt[2]);
                for(int j = 3; j <10000; j+=2){
                    if(cnt[j] != 0) System.out.print(" * " + j + "^" + cnt[j]);
                }
                System.out.println();
                ind++;
            }
        }
    }
}


/*
2
3
5
10
20

 */