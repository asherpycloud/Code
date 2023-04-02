package CCL2.C2023;

import java.util.Scanner;

public class C07ObligatoryDeMelloProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            char v = word.charAt(i);
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'y') {
                cnt++;
            }
        }
        if (cnt >= 2) System.out.println("good");
        else System.out.println("bad");
    }
}