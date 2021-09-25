package CCL1.C202109;

import java.util.Scanner;

public class C02IconScaling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int tr = 3*k, tc = 3*k;
        for(int r=0; r<tr; r++){
            for(int c=0; c<tc; c++) {
                int R = r / k, C = c / k;
                if ((R == 0 && C == 0) || (R == 0 && C == 2) || (R == 2 && C == 0) || (R == 2 && C == 2))
                    System.out.print("*");
                else if ((R == 0 && C == 1) || (R == 1 && C == 1) || (R == 1 && C == 2))
                    System.out.print("x");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
