package CCL1.C202107;

import java.util.Scanner;

// test case 1: 2 3 8 198000
// test case 2: 8 10 9 8 7 6 5 4 3 400
public class DealOrNoDealCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] bills = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
        int n = sc.nextInt(); // how many cases has been taken away
        for(int i = 0; i<n; i++){ // to read the input
            int e = sc.nextInt(); // which briefcase was opened
            bills[e-1] = 0;
        }
        int offer = sc.nextInt();
        int total = 0; // how much money is left when the suit case is taken away
        for(int i = 0; i<bills.length; i++){
            total+=bills[i];
        }
        double avg = total*1.0/(10 - n);
        if(offer>avg) System.out.println("deal");
        else System.out.println("no deal");
    }
}
