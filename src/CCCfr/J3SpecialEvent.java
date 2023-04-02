import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J3SpecialEvent {
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
        int N = readInt();
        int[] counts = new int[5];
        for (int i = 0; i < N; i++) {
            String line = next();
            for (int j = 0; j < 5; j++) {
                if (line.charAt(j) == 'Y') {
                    counts[j]++;
                }
            }
        }

        int max = 0, cnt = -1;
        for (int i = 0; i < 5; i++) {
            if (counts[i] > max) {
                max = counts[i];
            }
        }

        for(int i = 0; i < 5; i++) {
            if(counts[i] == max){
                cnt = i;
            }
        }
        for(int i = 0; i <5; i++){
            if(i == cnt) System.out.print(i+ 1);
            else if (counts[i] == max) System.out.print((i + 1) + ",");
        }
    }
}

/*
3
YY.Y.
...Y.
.YYY.

 */


/*
5
YY..Y
.YY.Y
.Y.Y.
.YY.Y
Y...Y

 */