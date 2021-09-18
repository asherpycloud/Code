package CCL1.C202107;

import java.util.Scanner;

public class LCDDisplay1 {
    static int s = 0, tr = 9, tc = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            s = sc.nextInt();
            String n = sc.next();
            if (s==0) System.exit(0);

            tr = 3+2*s; tc = 2+s;
            char[][][] lcdDigits = new char[n.length()][][];
            for(int i=0; i<n.length(); i++){
                char[][]lcdDigit = getLcdDigit(n.charAt(i));
                lcdDigits[i] = lcdDigit;
            }
            for(int r=0; r<tr; r++){
                for(int i=0; i<n.length(); i++){
                    for(int c=0; c<tc; c++){
                        System.out.print(lcdDigits[i][r][c]);
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    static char[][] getLcdDigit(char digit){
        char[][] lcdDigit = new char[tr][tc];
        for(int r=0; r<tr; r++){
            for(int c=0;c<tc; c++){
                lcdDigit[r][c] = ' ';
            }
        }
        int[] blocks;
        if(digit == '0') blocks = new int[]{1,2,3,5,6,7};
        else if (digit == '1') blocks = new int[]{3,6};
        else if (digit == '2') blocks = new int[]{1,3,4,5,7};
        else if (digit == '3') blocks = new int[]{1,3,4,6,7};
        else if (digit == '4') blocks = new int[]{2,3,4,6};
        else if (digit == '5') blocks = new int[]{1,2,4,6,7};
        else if (digit == '6') blocks = new int[]{1,2,4,5,6,7};
        else if (digit == '7') blocks = new int[]{1,3,6};
        else if (digit == '8') blocks = new int[]{1,2,3,4,5,6,7};
        else blocks = new int[]{1,2,3,4,6,7};
        for (int i=0; i<blocks.length; i++)
            markBlock(lcdDigit, blocks[i]);
        return lcdDigit;
    }

    static void markBlock(char[][] lcdDigit, int block) {
        if (block == 1){
            for (int c=1; c<=s; c++){
                lcdDigit[0][c] = '-';
            }
        } else if(block == 2){
            for (int r=1; r<=s; r++){
                lcdDigit[r][0] = '|';
            }
        } else if(block == 3){
            for (int r=1; r<=s; r++){
                lcdDigit[r][tc-1] = '|';
            }
        } else if(block == 4){
            for (int c=1; c<=s; c++){
                lcdDigit[s+1][c] = '-';
            }
        } else if(block == 5){
            for (int r=s+2; r<=tr-2; r++){
                lcdDigit[r][0] = '|';
            }
        }else if(block == 6){
            for (int r=s+2; r<=tr-2; r++){
                lcdDigit[r][tc-1] = '|';
            }
        }else if(block == 7){
            for (int c=1; c<=s; c++){
                lcdDigit[tr-1][c] = '-';
            }
        }
    }

    static void printLcdNum(char[][] lcdNum) {
        for(int r = 0; r<tr; r++) {
            for (int c=0; c<tc; c++) {
                System.out.print(lcdNum[r][c]);
            }
            System.out.println();
        }
    }
}
