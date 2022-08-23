package exercise.datastructure;

import java.util.Scanner;

public class FERGYSONBALLRATINGS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int star = 0;
        for(int i = 0; i<N; i++){
            int p = sc.nextInt();
            int f = sc.nextInt();

            if((p*5 - f*3) > 40) star++;
        }
        if(star == N) System.out.println(star + "+");
        else System.out.println(star);
    }
}
