package CCL1.C202109;

import java.util.Scanner;

public class C05PartyInvitation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int m = sc.nextInt();
        int[] source = new int[K];
        int[] target = new int[K];
        for(int i = 0; i<K; i++){
            source[i] = i+1;
        }
        for(int i = 0; i<m; i++){
            int r = sc.nextInt();
            int tj = 0;
            for(int j = 0; j<K; j++){
                if((j+1) % r != 0) {
                    target[tj] = source[j];
                    tj++;
                }
            }
            int[] tmp = source;
            source = target;
            target = tmp;
            K = tj;
        }
        for (int i=0; i<K; i++)
            System.out.println(source[i]);
    }
}



