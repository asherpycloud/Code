package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P011Boxes {
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
        int n = readInt(); //num of boxes
        int[][] boxes = new int[n][3];
        for(int i = 0; i <n ; i++){
            for(int j = 0; j<3; j++){
                boxes[i][j] = readInt();
            }
            Arrays.sort(boxes[i]);
        }
        java.util.Arrays.sort(boxes, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0] * a[1] * a[2], b[0] * b[1] * b[2]);
            }
        });

        int m = readInt();
        int[][] item = new int[m][3];
        boolean found = false;
        for(int i = 0; i <m; i++){
            for(int j = 0; j<3; j++){
                item[i][j] = readInt();
            }
            Arrays.sort(item[i]);
            for(int k = 0; k <3; k++) {
                if (item[i][0] <= boxes[k][0] && item[i][1] <= boxes[k][1] && item[i][2] <= boxes[k][2]){
                    found = true;
                    System.out.println(boxes[k][0] * boxes[k][1] * boxes[k][2]);
                    break;
                }
            }
        }
        if(found) System.out.println("Item does not fit.");
    }
}

/*
3
5 3 4
1 2 3
4 3 2
5
1 1 1
2 2 2
4 3 2
4 3 3
4 4 4

 */


//https://dmoj.ca/problem/ccc07s2