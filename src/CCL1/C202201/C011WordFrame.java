package CCL1.C202201;

import java.util.Scanner;

public class C011WordFrame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <5; i++) {
            String word = sc.nextLine();
            int TR = word.length()+2;
            int TC = word.length()+2;
            char[][] frame = new char[TR][TC];
            for(int r = 0; r<TR; r++){
                for(int c = 0; c<TC; c++){
                    frame[r][c] = '*';
                }
            }
            for(int c = 1; c<TC-1; c++){
                frame[0][c] = word.charAt(c-1);
            }
            for(int r = 1; r<TR-1; r++){
                frame[r][TC-1] = word.charAt(r-1);
            }
            for(int c = TC-2; c>0; c--){
                frame[TR-1][c] = word.charAt(word.length()-c);
            }
            for(int r = TR-2; r>0; r--){
                frame[r][0] = word.charAt(word.length() - r);
            }
            for(int r = 0; r<TR; r++){
                for(int c = 0; c<TC; c++) {
                    System.out.print(frame[r][c]);
                }
                System.out.println();
            }
        }
    }
}
