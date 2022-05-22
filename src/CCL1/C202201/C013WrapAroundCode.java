package CCL1.C202201;

import java.util.Scanner;

public class C013WrapAroundCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            char basec = 'A';
            StringBuilder sb = new StringBuilder();
            while (true) {
                char c = sc.next().charAt(0);
                if (c == '$') break;
                int rule = sc.nextInt();
                char rc = applyRule(rule, c, basec);
                sb.append(rc);
                basec = rc;
            }
            System.out.println(sb.toString());
        }
    }
    static char applyRule(int rule, char c, char basec){
        int n = c - 'A' + 1;
        int r = 0;
        switch(rule){
            case 1: r = n * 2; break;
            case 2: r = (n%3)*5; break;
            case 3: r = (n/4) * -8; break;
            case 4: r = (int)(Math.sqrt(n)) * -12; break;
            case 5: r = factorSum(n) * 10; break;
        }
        char rc = (char)(basec + r%26);
        if(rc > 'Z') rc -= 26;
        else if(rc < 'A') rc += 26;
        return rc;
    }
    static int factorSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0) sum += i;
        }
        return sum;
    }
}
/*
C 1 B 2 F 3 $
A 1 A 1 A 1 $
A 1 H 2 D 3 $
T 5 S 4 $
T 5 S 4 $

A 1 B 1 C 1 $
A 2 C 4 S 5 L 3 $
C 5 P 4 L 3 U 2 S 1 $
C 2 H 3 P 4 $
M 1 O 2 N 3 T 4 R 5 E 1 A 2 L 3 $

 */