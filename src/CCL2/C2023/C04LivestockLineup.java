package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class C04LivestockLineup {
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
    static String name [] = {"Bessie", "Buttercup", "Belinda", "Beatrice", "Bella", "Blue", "Betsy", "Sue"};
    static List<String> x = new ArrayList<>(), y = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        int n = readInt(); String s [] = new String[6];
        for(int i = 0; i <n; i++){
            for(int j = 0; j<6; j++){
                s[j] = next();
                x.add(s[0]); y.add(s[5]);
            }
            Arrays.sort(name);
            boolean used [] = new boolean[n+1];
            List<String> perm = new ArrayList<>();
            getPermutation(used, perm);
        }

    }

    static void getPermutation(boolean used[], List<String> perm){
        if(perm.size() == name.length){
            boolean work = true;
            for(int i = 0; i <x.size(); i++){
                int px = perm.indexOf(x.get(i)), py = perm.indexOf(y.get(i));
                if(Math.abs(px-py) !=1) work = false;
            }
            if(work){
                for(String each: perm) System.out.println(each);
                System.exit(0);
            }
            return;
        }
        for(int i =0; i <name.length; i++){
            if(!used[i]){
                perm.add(name[i]); used[i] = true;
                getPermutation(used, perm);
                perm.remove(perm.size() -1); used[1] = false;
            }
        }
    }
}
