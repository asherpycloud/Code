import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        while(n1 + n2 != 100) {
            System.out.println("Please type in the two numbers: ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            System.out.println("The bigger number is: " + Math.max(n1, n2));
        }
        System.out.println("Game Over!!!");
    }
}
