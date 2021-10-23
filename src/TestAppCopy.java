public class TestAppCopy {
    public static void main(String[] args){
        int[] arr = new int[20];
        for(int i = 0; i<20; i++){
            arr[i] = 20-i;
        }

        System.out.print("[");
        for(int i = 0; i<20; i++){
            System.out.print(arr[i]);
            if(i != 19) System.out.print(", ");
        }
        System.out.print("]");
    }
}