package exercise.datastructure;

import java.util.Scanner;

public class SHARINGISCARING {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[][] googol = new String[M][3];
        for(int i = 0; i<M; i++){
            googol[i][0] = sc.next();
            googol[i][1] = sc.nextLine().trim();
            googol[i][2] = sc.nextLine();
        }
        String Y = sc.nextLine();
        for(int i = 0; i < M; i++){
            if(googol[i][1].equals(Y)) System.out.println(googol[i][2]);
        }
    }
}
/*
3 3
1 2
Road to Becoming a Philosopher
2 3
Hello, World
3 2
Untitled Document
2

 */
