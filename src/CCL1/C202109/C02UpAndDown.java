package CCL1.C202109;

import java.util.Scanner;

public class C02UpAndDown {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), s = sc.nextInt();
        int N = 0, B = 0;
        for(int i = 0; i<s; i++){
            int r = i%(a+b);
            if(r<a) N+=1;
            else N-=1;
            r = i%(c+d);
            if(r<c) B+=1;
            else B-=1;
        }
        if(B<N) System.out.println("Nikki");
        else if(B==N) System.out.println("Tied");
        else System.out.println("Byron");
    }
}
