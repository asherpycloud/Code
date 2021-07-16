import java.util.Scanner;

public class WhoHasSeenTheWind {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int A = -6*m*m*m*m + h*m*m*m + 3*m*m + m;
        if (A>0) System.out.println("The balloon does not touch the ground in the given time.");
        else {
            for(int i=1; i<=m; i++){
                A = -6*i*i*i*i + h*i*i*i + 3*i*i + i;
                if(A <= 0){
                    System.out.println("The balloon first touches the ground at hour:" + i);
                    System.exit(0);
                }
            }
        }
    }
}
