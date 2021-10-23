package CCL1.C202109;

import java.util.Scanner;

public class C06FractionAction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //read input
        int n = sc.nextInt();
        int d = sc.nextInt();
        //divide it
        int q = n/d;
        int r = n%d;
        // find GCD
        if(r>0) {
            for(int i = r; i>1; i--){
                if(r%i == 0 && d%i == 0) {
                    r = r/i;
                    d = d/i;
                    break;
                }
            }
            //turn remainder and divider into fraction
            System.out.println(q + " " + r + "/" + d);
        }
        //print
        else System.out.println(q);
    }
}
