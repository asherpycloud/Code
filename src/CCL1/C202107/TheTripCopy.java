package CCL1.C202107;

import java.util.Scanner;

public class TheTripCopy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            double total = 0;
            double[] expenses = new double[n];
            for(int i = 0; i<n; i++){
                expenses[i] = sc.nextDouble();
                total+=expenses[i];
            }
            double avg = total/n;
            double sum = 0;
            for(int i = 0; i<n; i++){
                if(expenses[i]<avg)
                    sum += avg-expenses[i];
            }
            System.out.printf("$%.2f\n", sum);
        }
    }
}
