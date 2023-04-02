//package CCCfr;

import java.util.Scanner;

public class J4Trianglane {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        //building
        int[][] tri = new int[C][2];
        for(int j = 0; j<2; j++){
            for(int i = 0; i <C; i++) {
                tri[j][C] = sc.nextInt();
            }
        }

        //actual stuff
        int cnt = 0;
        for(int j = 0; j<2; j++){
            for(int i = 0; i <C; i++) {
                if(tri[j][i] == 1 && i % 2 == 0){ //right left down
                    cnt+=3;
                    tri[j][i] = 2;
                    if(i == 0 && j==0){ //first ones
                        if(tri[j][i++] == 1){
                            cnt++;
                            tri[j][i++] = 2;
                        }else if(tri[j--][i] == 1){
                            cnt++;
                            tri[j--][i] = 2;
                        }
                    }else if(i == 1 && j==0){
                    }
                }
            }
        }
    }
}

