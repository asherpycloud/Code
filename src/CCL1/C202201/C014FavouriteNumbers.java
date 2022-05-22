package CCL1.C202201;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class C014FavouriteNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //size of list
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<N; i++){
            int n = sc.nextInt();
            if(!map.containsKey(n)) map.put(n, 1);
            else map.put(n, map.get(n)+1);
        }

        int[] arr = new int[map.keySet().size()];
        int i = 0;
        for(int n : map.keySet()) arr[i++] = n;
        Arrays.sort(arr);

        int Q = sc.nextInt(); //Number of numbers given
        for(int j = 0; j<Q; j++){
            int q = sc.nextInt();
            int s=0, e= arr.length-1;
            while(s<e){
                int m = (s+e)/2;
                if(arr[m] == q) { e = m; break; }
                else if(arr[m] > q) { e = m; }
                else s = m + 1;
            }
            System.out.println(arr[e] + " " + map.get(arr[e]));
        }
    }
}

/*
10
-2 8 -100 19 -2 -2 8 -100 8 8
5
6
8
17
-1000
-10

 */