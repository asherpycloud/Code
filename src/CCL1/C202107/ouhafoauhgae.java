package CCL1.C202107;

import java.util.;

public class help {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x < 1) {
            y = x;
        } else if (1 <= x && x > 10) {
            y = 2x - 1;
        } else if (x >= 10) {
            y = 3*x - 11;
        }
        return x;


        System.out.print("tf u wanna output idfk and u cant return that x there bro :/");


    }

}