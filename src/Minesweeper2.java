import java.util.Scanner;

public class Minesweeper2 {
    static int tr, tc; //global variable. This variable can be read from any function in the class
    static char[][] in;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            //read input
            tr = sc.nextInt();
            tc = sc.nextInt();
            sc.nextLine(); //to read the entire line
            if(tr == 0 && tc == 0) break;

            in = new char[tr][tc];
            for (int r = 0; r<tr; r++) { //to read row input by row
                String line = sc.nextLine();
                for(int c = 0; c<tc; c++){
                    in[r][c] = line.charAt(c); //to put in the array
                }
            }

            //process
            char[][] out = new char[tr][tc];
            for(int r=0; r<tr;r++){
                for(int c=0; c<tc; c++){
                    if(in[r][c] == '*') out[r][c] = '*';
                    else{
                        int mine_cnt = 0;
                        if (isMine(r-1, c-1)) mine_cnt++;
                        if (isMine(r-1, c)) mine_cnt++;
                        if (isMine(r-1, c+1)) mine_cnt++;
                        if (isMine(r, c+1)) mine_cnt++;
                        if (isMine(r+1, c+1)) mine_cnt++;
                        if (isMine(r+1, c)) mine_cnt++;
                        if (isMine(r+1, c-1)) mine_cnt++;
                        if (isMine(r, c-1)) mine_cnt++;
                        out[r][c] = (char)('0' + mine_cnt);
                    }
                }
            }
            printArray(out);
        }
    }

    static boolean isMine(int r, int c){
        if (isValid(r, c) && in[r][c] =='*') return true;
        return false;
    }

    static boolean isValid(int r, int c){
        if(r <0 || r>= tr) return false;
        if(c <0 || c>= tc) return false;
        return true;
    }

    static void printArray(char[][] arr) {
        for(int r = 0; r <arr.length; r++){
            for(int c = 0; c<arr[r].length; c++){
                System.out.print(arr[r][c]);
            }
            System.out.println();
        }
    }
}
