package exercise.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AVOCADOTREES {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1<<20);
        String[] arr = br.readLine().split(" ");
        int N = gi(arr[0]), Q = gi(arr[1]), H = gi(arr[2]);
        int[] psa = new int[N+1];
        for(int i = 0; i<N; i++){
            arr = br.readLine().split(" ");
            int a = gi(arr[0]), b = gi(arr[1]);
            if(a > H) b = 0;
            psa[i + 1] = psa[i] + b;
        }
        int max = 0;
        for(int i = 0; i <Q; i++){
            arr = br.readLine().split(" ");
            int l = gi(arr[0]), r = gi(arr[1]);
            int yeild = psa[r] - psa[l-1];
            if(yeild > max) max = yeild;
        }
        System.out.println(max);
    }
    static int gi(String s) {
        int n = 0;
        for (int i=0; i<s.length(); i++)
            n = (n<<3) + (n<<1) + s.charAt(i) - '0';
        return n;
    }
}
