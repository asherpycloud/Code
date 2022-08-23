package exercise.datastructure;

import java.util.Scanner;

public class DailyPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        printArray(arr);

        reverseArray(arr);
        printArray(arr);

        reverseArray2(arr);
        printArray(arr);

        rotateArray(arr, 2);
        printArray(arr);
    }

    public static void reverseArray(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        int t = 0;
        while(s<e){
            t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            if(i < (arr.length - 1)) System.out.print(arr[i] + ", ");
            else System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    public static void reverseArray2(int[] arr){
        int e = arr.length-1;
        int t = 0;
        for(int s = 0; s < e; s++, e--){
            t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
        }
    }

    public static void rotateArray(int[] arr, int step){
        int s = step%arr.length;
        if(s == 0) return;
        int[] t = new int[arr.length*2];
        for(int i = 0; i<arr.length; i++) t[i] = arr[i];
        for(int i = 0; i<arr.length; i++) t[arr.length+i] = arr[i];
        for(int i = 0; i<arr.length; i++) arr[i] = 0;
        if(s>0){
            for(int i = 0; i<arr.length; i++) arr[i] = t[arr.length + i - s];
        } else{ 
            for(int i = 0; i<arr.length; i++) arr[i] = t[i - s];
        }
    }
}
