import java.util.Random;
import java.util.Scanner;

public class GuessNumber2Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while(true){
            System.out.println("================================================================");
            System.out.println("The System randomly generates a number between 0 and 50.");
            int n = random.nextInt(50);
            boolean b = false;
            System.out.println("Guess what the number is:");
            for(int i = 0; i < 10; i++){
                int x = sc.nextInt();
                if (x == n){
                    System.out.println("Goodjob, loser.");
                    b = true;
                    break;
                }else if (x < n){
                    System.out.println("Your number is too small");
                }else{
                    System.out.println("Your number is too big");
                }
            }
            if (!b) {
                System.out.println("You lost");
            }
        }
    }
}
