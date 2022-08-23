package CCL1.C202201;

import java.util.ArrayList;
import java.util.Scanner;

public class C020JollyJumpers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] strings = line.split(" ");
        int[] arr = new int[strings.length];
        for(int i = 0; i<strings.length; i++){
            arr[i] = Integer.valueOf(strings[i]);
        }

        int[] numbers = new int[strings.length];
        boolean[] jolly = new boolean[strings.length];
        for(int i = 1; i<strings.length; i++){
            int diff = Math.abs(arr[i] - arr[i-1]);
            if (diff <= 0 || diff >= strings.length || jolly[diff]){
                System.out.println("Not jolly");
                System.exit(0);
            }
            jolly[diff] = true;
        }
        System.out.println("Jolly");
    }
}

// 4 1 4 2 3
// 5 1 4 2 -1 6
