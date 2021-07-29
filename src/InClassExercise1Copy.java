import java.util.Scanner;

public class InClassExercise1Copy {
    public static void main(String[] arg){
        String[] in = new String[14];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<=13; i++){
            in[i] = sc.nextLine().toUpperCase();
        }

        for(int i = 0; i<=13; i++){
            System.out.println(in[i]);
        }
    }
}
