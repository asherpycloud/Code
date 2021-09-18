package CCL1.C202107;

import java.util.Scanner;

public class LCDDisplay {
    static int s = 0, tr = 9, tc = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){ //continuously scan the input until you read in a zero
            s = sc.nextInt(); //if s equals 0, the system will stop. S = size of output
            String n = sc.next(); //n is the number you want to print
            if (s==0) System.exit(0); // the determinate whether or not the s is 0. If s is 0, the system will stop

            tr = 3+2*s; tc = 2+s; //This is to calculate total number of rows and columns of the lcd digits
            char[][][] lcdDigits = new char[n.length()][][]; // to save all the lcd digits
            for(int i=0; i<n.length(); i++){ //to get lcd digit for every digit in number n
                char[][]lcdDigit = getLcdDigit(n.charAt(i)); //to get the lcd digit
                lcdDigits[i] = lcdDigit; // to save the lcd digit
            }
            for(int r=0; r<tr; r++){ //now you've gotten all of your lcd digits, now you print them row by row,--
                for(int i=0; i<n.length(); i++){ // --digit by digit,--
                    for(int c=0; c<tc; c++){ // --column by column
                        System.out.print(lcdDigits[i][r][c]); //to print each digit's rows an columns
                    }
                    System.out.print(" "); // after each printed digit, you add a space
                }
                System.out.println(); // starting to print the next row
            }
        }
    }

    static char[][] getLcdDigit(char digit){ //to get digit... your input is a digit, your output is a lcd digit in 2D array format
        char[][] lcdDigit = new char[tr][tc]; //creating the 2D array
        for(int r=0; r<tr; r++){ // put space in the 2D array
            for(int c=0;c<tc; c++){ //put space in the 2D array
                lcdDigit[r][c] = ' '; // to put space in the 2D array, row by row, column by column
            }
        }
        int[] blocks; //these are the blocks used to form the output
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
        for (int i=0; i<blocks.length; i++) //to mark certain blocks according to the digits
            markBlock(lcdDigit, blocks[i]); //to mark the blocks
        return lcdDigit;
    }

    static void markBlock(char[][] lcdDigit, int block) {
        if (block == 1){
            for (int c=1; c<=s; c++){
                lcdDigit[0][c] = '-'; //to change the columns to a dash
            }
        } else if(block == 2){
            for (int r=1; r<=s; r++){
                lcdDigit[r][0] = '|'; //to change the rows to a pipe
            }
        } else if(block == 3){
            for (int r=1; r<=s; r++){
                lcdDigit[r][tc-1] = '|'; //change the rows to a pipe
            }
        } else if(block == 4){
            for (int c=1; c<=s; c++){
                lcdDigit[s+1][c] = '-'; //change the columns to a dash
            }
        } else if(block == 5){
            for (int r=s+2; r<=tr-2; r++){
                lcdDigit[r][0] = '|'; //change the row to a pipe
            }
        }else if(block == 6){
            for (int r=s+2; r<=tr-2; r++){
                lcdDigit[r][tc-1] = '|'; //change the row to a pipe
            }
        }else if(block == 7){
            for (int c=1; c<=s; c++){
                lcdDigit[tr-1][c] = '-'; //change the column to a dash
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
