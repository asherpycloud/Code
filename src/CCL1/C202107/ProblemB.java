package CCL1.C202107;

import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            String s = sc.next();
            process(s);
        }
    }
    static void process(String ps) {
        int l = ps.length();
        char[] arr = new char[l];
        for (int i=0; i<l; i++) arr[i] = ps.charAt(i);
        while (l > 1) {
            for (int i=0; i<l; i++) System.out.print(arr[i]);
            System.out.println();
            if (arr[l-2] >= arr[l-1]) {
                arr[l-2] = (char)('0' + (arr[l-2] - arr[l-1]));
            } else {
                arr[l-2] = (char)('0' + (10 + arr[l-2] - arr[l-1]));
                for (int i = l-3; i>=0; i++) {
                    if (arr[i] == '0') arr[i] = '9';
                    else {
                        arr[i] = (char)(arr[i] - 1);
                        break;
                    }
                }
            }
            l--;
        }
        if (arr[0] == '0') System.out.println(ps  + " is divisible by 11");
        else System.out.println(ps + " is not divisible by 11");
    }
}