package CCL2.C20220917;

import java.util.Scanner;

public class P4TournamentSelection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = 0;
        int L = 0;
        int i = 0;
        while(i<6){
            String re = sc.next();
            if(re.equals("W")) W++;
            else L++;
            i++;
        }
        if(W==6 || W==5) System.out.println("1");
        else if (W==3 || W == 4) System.out.println("2");
        else if (W== 2|| W == 1) System.out.println("3");
        else System.out.println("-1");
    }
}

/*
W
L
W
W
L
W

 */

/*
L
L
L
L
L
L

*/

//https://dmoj.ca/problem/ccc16j1