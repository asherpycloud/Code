package CCL1.C202109;

import java.util.Scanner;

public class C08BridgeTransport {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int N = sc.nextInt();
        int[] cars = new int[N];
        for(int i = 0; i<N; i++){
            cars[i] = sc.nextInt();
        }
        int counter = 0;
        for(int i = 0; i<=N-4; i++){
            int sum = cars[i] + cars[i+1] + cars[i+2] + cars[i+3];
            if(sum>W) break;
            else counter++;
        }
        if(counter>0) counter+=3;
        System.out.println(counter);
    }
}

/*
100
6
50
30
10
10
40
50

 */
/*
100
3
150
1
1


 */