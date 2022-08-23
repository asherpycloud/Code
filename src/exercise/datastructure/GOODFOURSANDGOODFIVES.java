package exercise.datastructure;

import java.util.Scanner;

public class GOODFOURSANDGOODFIVES {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sums = 0;
        if(N % 4 == 0) sums++;
        if(N % 5 == 0) sums++;
        for(int i = 4; i< N; i+=4){
            N = N - 4;
            if(N % 5 == 0) sums++;
        }
        System.out.println(sums);
    }
}
