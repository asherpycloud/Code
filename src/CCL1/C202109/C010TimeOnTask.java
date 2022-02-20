package CCL1.C202109;

import java.util.Arrays;
import java.util.Scanner;

public class C010TimeOnTask {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //Max minutes you get to complete chores
        int C = sc.nextInt(); //The chores you have to do
        int[] chores = new int[C];
        for(int i = 0; i<C; i++){
            chores[i] = sc.nextInt();
        }
        Arrays.sort(chores);
        int sum = 0;
        for(int i = 0; i<C; i++){
            sum += chores[i];
            if(sum>=T){
                System.out.println(i+1);
                break;
            }
        }
    }
}
