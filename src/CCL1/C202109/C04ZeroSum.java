package CCL1.C202109;

import java.util.Scanner;

public class C04ZeroSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i<T; i++){
            boolean find = false;
            int N = sc.nextInt();
            int[] input = new int[N];
            for(int j = 0; j<N; j++){
                input[j] = sc.nextInt();
                if(input[j] == 0) find = true;
            }


            if(!find){
                int sum = 0;
                for(int j = 0; j<N; j++){
                    sum = 0;
                    for(int k=j; k<N; k++){
                        sum = sum+input[k];
                        if(sum == 0) {
                            find = true;
                            break;
                        }
                    }
                    if(find) break;
                }
            }
            if(find) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}

/*
2
5
4 2 -3 1 6
5
4 2 0 1 6
 */