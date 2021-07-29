import java.util.Scanner;

public class DealOrNoDealCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] bills = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int e = sc.nextInt();
            bills[e-1] = 0;
        }
        int offer = sc.nextInt();
        int total = 0;
        for(int i = 0; i<bills.length; i++){
            total+=bills[i];
        }
        double avg = total*1.0/(10 - n);
        if(offer>avg) System.out.println("deal");
        else System.out.println("no deal");
    }
}
