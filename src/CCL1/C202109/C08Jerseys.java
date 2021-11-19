package CCL1.C202109;

import java.util.Scanner;

public class C08Jerseys {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int J = sc.nextInt();
        int A = sc.nextInt();
        char[] jerseys = new char[J+1]; //size
        for(int i = 1; i<=J; i++){
            //Read the jersey sizes
            jerseys[i] = sc.next().charAt(0); //reads token

        }
        int counter = 0;
        for(int i = 0; i<A; i++) {
            //Read in your athletes requests
            char reqS = sc.next().charAt(0);
            int reqN = sc.nextInt();
            if (jerseys[reqN] != '0' && (jerseys[reqN] == reqS || jerseys[reqN] < reqS)){
                //See if you can fulfill their requests
                counter++;
            //Mark that the jersey is gone
                jerseys[reqN] = '0';
            }
        }
        //print when you cant fulfill anymore requests
        System.out.println(counter);
    }
}
/*
4
3
M
S
S
L
L 3
S 3
L 1

 */