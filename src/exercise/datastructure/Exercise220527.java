package exercise.datastructure;

public class Exercise220527 {
    public static void main(String[] args){
        int[] arr = new int[20];
        for(int i = 0; i < 20; i++){
            arr[i] = i;
        }
        printArray(arr);

        reverseArray(arr);
        printArray(arr);

        reverseArray2(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            if (i < (arr.length - 1)) System.out.print(arr[i] + ", ");
            else System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    public static void reverseArray(int[] arr){
        int s = 0, e = arr.length-1, t = 0;
        while(s<e){
            t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
    }

    public static void reverseArray2(int[] arr){
        int e = arr.length-1, t = 0;
        for(int s = 0; s < e; s++, e--){
            t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
        }
    }

    public static void rotateArray(int[] arr, int step){

    }
}