package exercise.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SORTING {
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
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = readInt();
        }
        Arrays.sort(nums);
        for(int i = 0; i<n; i++){
            System.out.println(nums[i]);
        }
    }
}
