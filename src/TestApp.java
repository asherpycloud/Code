public class TestApp {
    public static void main(String[] args){
        int[] arr = new int[10];
        for(int i = 0; i<10; i++){
            arr[i] = i;
        }
        printArray(arr);

        int[] arr1 = new int[20];
        for(int i = 0; i<20; i+=2){
            arr1[i] = i+1;
        }
        printArray(arr1);


        int[] arr2 = new int[30];
        for(int i = 1; i<30; i+=2){
            arr2[i] = i+1;
        }
        printArray(arr2);
    }

    static void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length-1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
