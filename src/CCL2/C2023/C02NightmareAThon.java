package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C02NightmareAThon {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int Q = Integer.parseInt(strs[1]);
        strs = br.readLine().split(" ");
        int maxrate = 0;
        int episodes = strs.length;
        int[][] psa = new int[11][episodes+1];
        for(int i = 1; i<=N; i++){
            int rates =Integer.parseInt(strs[i-1]);
            maxrate = Math.max(maxrate, rates);
            for(int j =1; j<=maxrate; j++)
                psa[j][i] = psa[j][i-1];
            psa[rates][i]++;
        }

        for(int i = 0; i < Q; i++){
            strs = br.readLine().split(" ");
            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);
            int cnt = 0, highest = 0;
            for(int j = maxrate; j>0; j--){
                cnt = psa[j][a-1] + psa[j][episodes] - psa[j][b];
                if(cnt> 0){
                    highest = j;
                    break;
                }
            }
            System.out.println(highest + " " + cnt);
        }
    }
}



/*
7 2
5 4 5 2 3 1 5
2 4
1 6

 */