package CCL1.C202109;

import java.util.Arrays;
import java.util.Scanner;

public class C011PinballRanking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // total number of games played
        int[] scores = new int[t]; //array of the scores
        int ranks = 0;
        for(int i = 0; i<t; i++){
            scores[0] = sc.nextInt();
            //sort array
            int score = scores[0];
            Arrays.sort(scores);
            //find the ranking of each score in the sorted array
            for(int j = t-1; j>=0; j--){
                if(score == scores[j]){
                    ranks += t-j;
                    break;
                }
            }
        }
        //calculate and print the average of all the ranks
        System.out.printf("%.2f", ranks*1.0/t);
    }
}

/*
5
100
200
150
170
50

*/
