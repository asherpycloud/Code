package CCCprep2023;

import java.util.Scanner;

public class J2Instructions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String dir = "";
        while(N != 99999){
            if(((N/10000) + ((N/1000)%10)) % 2 == 0 && ((N/10000) + ((N/1000)%10)) != 0){
                dir = "right";
                System.out.print("right");
            }else if(((N/10000) + ((N/1000)%10)) == 0) System.out.print(dir);
            else if(((N/10000) + ((N/1000)%10)) % 2 != 0){
                dir = "left";
                System.out.print("left");
            }
            System.out.println(" " + (N % 1000));
            N = sc.nextInt();
        }
    }
}

/*
57234
00907
34100
99999

 */