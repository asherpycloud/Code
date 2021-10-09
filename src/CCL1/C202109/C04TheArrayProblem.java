package CCL1.C202109;

import java.util.Scanner;

public class C04TheArrayProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i<T; i++) {
            int N = sc.nextInt();
            int[] oldarr = new int[N];
            for(int j = 0; j<N; j++){
                oldarr[j] = sc.nextInt();
            }
            int sum = 0;
            for(int j = 0; j<N; j++){
                sum = sum + oldarr[j];
            }

            int[] newarr = new int[N];
            for(int j = 0; j<N; j++){
                newarr[j] = sum - oldarr[j];
            }
            for(int j = 0; j<N; j++){
                System.out.print(newarr[j] + " ");
            }
        }
    }
}
/*
2
4
1 2 3 4
3
4 5 6
*/
