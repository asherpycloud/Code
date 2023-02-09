package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class C02MultipleOfK {
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
        String[] line1 = br.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);
        String[] line2 = br.readLine().split(" ");
        int[] nums = new int[n];
        for(int i = 0; i <n; i++){
            nums[i] = Integer.parseInt(line2[i]);
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum =0;
        int maxLen = 0;
        for(int i =0; i<n; i++){
            sum = (sum+nums[i]) % k;
            if(map.containsKey(sum)){
                maxLen=Math.max(maxLen, i-map.get(sum));
            }else {
                map.put(sum,i);
            }
        }
        System.out.println(maxLen == 0 ? -1 : maxLen);
    }
}

/*
6 7
3 5 1 6 2 14

 */


//https://dmoj.ca/problem/oly19practice19