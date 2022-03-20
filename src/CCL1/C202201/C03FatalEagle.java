package CCL1.C202201;

import java.util.Scanner;

public class C03FatalEagle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int e=N-1; e>=1; e--){
            for(int j = 1; j<=e; j++){
                if(arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    printArray(arr);
                }
            }
        }
    }

    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
