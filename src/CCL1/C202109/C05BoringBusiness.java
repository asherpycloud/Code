package CCL1.C202109;

import java.util.Scanner;

public class C05BoringBusiness {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[][] map = new boolean[100][100];
        map[0][3] = true;
        map[1][3] = true;
        map[2][3] = true; map[2][4] = true; map[2][5] = true; map[2][6] = true; map[2][8] = true; map[2][9] = true; map[2][10] = true;
        map[3][6] = true; map[3][8] = true; map[3][10] = true;
        map[4][2] = true; map[4][6] = true; map[4][7] = true; map[4][8] = true; map[4][10] = true;
        map[5][2] = true; map[5][10] = true;
        map[6][2] = true; map[6][3] = true; map[6][4] = true; map[6][5] = true; map[6][6] = true; map[6][7] = true; map[6][8] = true; map[6][9] = true; map[6][10] = true;

        int r = 4;
        int c = 2;
        while(true){
            String direction = sc.next();
            if(direction.equals("q")) System.exit(0);
            int step = sc.nextInt();
            boolean hit = false;
            for(int i = 0; i<step; i++){
                if(direction.equals("l")) c-=1;
                else if(direction.equals("d")) r+=1;
                else if(direction.equals("r")) c+=1;
                else if(direction.equals("u")) r-=1;
                if(map[r][c]) hit = true;
            }
            if(hit) {
                System.out.println((c-3) + " " + (0-(r+1)) + " DANGER");
                System.exit(0);
            }
            else System.out.println((c-3) + " " + (0-(r+1)) + " safe");
        }
    }
}

// l 2 d 2 r 1 q 0
// r 2 d 10 r 4
