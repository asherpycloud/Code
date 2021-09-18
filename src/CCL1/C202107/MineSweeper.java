package CCL1.C202107;

import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            //read input
            int tr = sc.nextInt(), tc = sc.nextInt();
            sc.nextLine();
            if(tr == 0 && tc == 0) break;

            char[][] in = new char[tr][tc];
            for (int r = 0; r<tr; r++) {
                String line = sc.nextLine();
                for(int c = 0; c<tc; c++){
                    in[r][c] = line.charAt(c);
                }
            }

            //process
            char[][] out = new char[tr][tc];
            for(int r=0; r<tr;r++){
                for(int c=0; c<tc; c++){
                    if(in[r][c] == '*') out[r][c] = '*';
                    else{
                        int mine_cnt = 0;
                        if (r - 1 >= 0 && c - 1 >= 0 && in[r - 1][c-1] == '*') mine_cnt++; //0
                        if (r - 1 >= 0 && in[r - 1][c] == '*') mine_cnt++;//1
                        if (r - 1 >= 0 && c + 1 < tc && in[r - 1][c+1] == '*') mine_cnt++;//2
                        if (c + 1 < tc && in[r][c+1] == '*') mine_cnt++;//3
                        if (r + 1 < tr && c + 1 < tc && in[r + 1][c+1] == '*') mine_cnt++;//4
                        if (r + 1 < tr && in[r + 1][c] == '*') mine_cnt++;//5
                        if (r + 1 < tr && c - 1 >= 0 && in[r + 1][c-1] == '*') mine_cnt++;//6
                        if (c - 1 >= 0 && in[r][c-1] == '*') mine_cnt++;//7
                        out[r][c] = (char)('0' + mine_cnt);
                    }
                }
            }
            printArray(out);
        }
    }

    static void printArray(char[][] arr) {
        for(int r = 0; r <arr.length; r++){
            for(int c = 0; c<arr[r].length; c++){
                System.out.printf(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}
