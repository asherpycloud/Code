package CCL1.C202109;

import java.util.Scanner;

public class C07BouncingSequence {
    static int k0 = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        k0 = k;
        int result = minus5(k);
        add5(result);
    }

    public static int minus5(int k){
        System.out.print(k + " ");
        if(k>0){
            return minus5(k-5);
        } else{
            return k;
        }
    }

    public static int add5(int k){
        if(k>0) System.out.print(k + " ");
        if(k<k0){
            return add5(k+5);
        } else{
            return k;
        }
    }

}
/*
public static [output data type] [function name]([Your function input])

 */
