package CCL1.C202109;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C010TandemBicycle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt(); //type of question
        int N = sc.nextInt(); //number of ppl
        int[] speedsD = new int[N]; //Speeds of Dmojistan ppl
        int[] speedsP = new int[N]; //speeds of Pegland ppl
        for(int i = 0; i<N; i++){ //read in speeds of dmojistan
            speedsD[i] = sc.nextInt();
        }
        for(int i = 0; i<N; i++){ //read in speeds of Pegland
            speedsP[i] = sc.nextInt();
        }

        //We sort array to pair the speeds
        if(Q == 1){ //determining which question to answer
            //sort two lists in ascending order
            Arrays.sort(speedsD); //by default is sorting in ascending order
            Arrays.sort(speedsP);
        } else{
            //sort first array ascending
            Arrays.sort(speedsD);
            //sort second array descending
            Arrays.sort(speedsP);
            int[] speedsPnew = new int[N]; //speedsP in descending order
            for(int i = 0; i<N; i++){ //looping through array to reverse the array order
                speedsPnew[N-1-i] = speedsP[i];
            }
            speedsP = speedsPnew;
        }

        //Take the speeds in the same index of the two arrays and pair them
        int sum = 0; // your sum
        for(int i = 0; i<N; i++){
            //Add the larger speeds together. You need a sum
            sum += Math.max(speedsD[i], speedsP[i]); //Determine which speed is larger
        }
        System.out.println(sum);

    }
}

/*
1
3
5 1 4
6 2 4

 */

/*
2
3
5 1 4
6 2 4

*/

/*
2
5
202 177 189 589 102
17 78 1 496 540

*/