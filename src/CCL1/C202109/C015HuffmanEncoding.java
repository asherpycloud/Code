package CCL1.C202109;

import java.util.Scanner;

public class C015HuffmanEncoding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); //The number of characters associated with the codes
        int[] code = new int[k]; //list of the codes
        for(int i = 0; i<k; i++){
            code[i] = sc.nextInt(); //putting the codes in the array
        }
    }
}
