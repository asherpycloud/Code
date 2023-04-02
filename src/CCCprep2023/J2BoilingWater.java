package CCCprep2023;

import java.util.Scanner;

public class J2BoilingWater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int P = 5*B - 400;
        if(P == 100) System.out.println(P + "\n0");
        else if(P < 100) System.out.println(P + "\n1");
        else System.out.println(P + "\n-1");
    }
}
/*
99

 */