package CCCprep2023;


import java.util.Scanner;

public class J1CupcakeParty {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int R =  sc.nextInt(), S = sc.nextInt();
        System.out.println((8*R + 3*S) - 28);
    }
}
