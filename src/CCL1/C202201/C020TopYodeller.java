//package CCL1.C202201;
//
//import java.util.Scanner;
//
//public class C020TopYodeller {
//    public class Score implements Comparable<Score>{
//        int id, score, worstRank;
//        Score(int pid, int pscore){
//            id = pid; score = pscore;
//        }
//        public int compareTo(Score o){
//            return score = o.score;
//        }
//        public int setRank(int pworstRank){
//            if(pworstRank < worstRank)
//                worstRank = pworstRank;
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); //Number of participants
//        int k = sc.nextInt(); //rounds
//        int[] score = new int[n];
//        int[] worstRanks = new int[n];
//        for(int i = 0; i<k; i++){
//            for(int j = 0; j<n; j++){
//                score[j] += sc.nextInt();
//            }
//        }
//        int max = Integer.MIN_VALUE;
//        int maxID = -1;
//        for(int i = 0; i<n; i++){
//            if(score[i] > max){
//                max = score[i];
//                maxID = i;
//            }
//        }
//        System.out.println("Yodeller " + maxID+1 + " is the TopYodeller: score " + max + ", worst rank ");
//    }
//}
