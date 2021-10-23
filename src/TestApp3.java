public class TestApp3 {
    public static void main(String[] args){
        int[] arr = new int[10];
        double sum = 0;
        for(int i = 0; i < 10; i++){
            arr[i] = i+1;
            sum = sum + i;
        }
        System.out.println(sum);
        double avg = (sum/10)*1.0;
        System.out.println(avg);
    }
}
