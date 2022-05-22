package CCL1.C202201;

import java.util.Scanner;

public class C017AromaticNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int[] arr = new int[input.length()];
        for(int i = 0; i<arr.length; i+=2){
            arr[i] = input.charAt(i) - '0';
            if(input.charAt(i+1) == 'I') arr[i+1] = 1;
            else if(input.charAt(i+1) == 'V') arr[i+1] = 5;
            else if(input.charAt(i+1) == 'X') arr[i+1] = 10;
            else if(input.charAt(i+1) == 'L') arr[i+1] = 50;
            else if(input.charAt(i+1) == 'C') arr[i+1] = 100;
            else if(input.charAt(i+1) == 'D') arr[i+1] = 500;
            else if(input.charAt(i+1) == 'M') arr[i+1] = 1000;
        }
        int n = 0;
        for(int i = 0; i<arr.length; i+=2){
            int v = arr[i] * arr[i+1];
            if(i+3<arr.length && arr[i+1] < arr[i+3]) n -= v;
            else n += v;
        }
        System.out.println(n);
    }
}

/*
3M1D2C

2I3I2X9V1X

 */