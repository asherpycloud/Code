package CCL1.C202201;

import java.util.Scanner;

public class C012CardGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] deck = new String[52];
        for(int i = 0; i<52; i++){
            deck[i] = sc.nextLine();
        }
        int cnt = 0;
        int[] scores = new int[52];
        for(int i = 51; i>=0; i--){
            if(deck[i].equals("ace")){
                if(cnt>=4) scores[i] = 4;
                cnt = 0;
            }else if(deck[i].equals("king")){
                if(cnt>=3) scores[i] = 3;
                cnt = 0;
            }else if(deck[i].equals("queen")){
                if(cnt>=2) scores[i] = 2;
                cnt = 0;
            }else if(deck[i].equals("jack")){
                if(cnt>=1) scores[i] = 1;
                cnt = 0;
            }else{
                cnt++;
            }
        }
        int A = 0, B = 0;
        for(int i = 0; i<52; i++){
            if(scores[i] > 0){
                if(i%2 == 0){
                    System.out.println("Player A scores " + scores[i] + " point(s).");
                    A += scores[i];
                }else{
                    System.out.println("Player B scores " + scores[i] + " point(s).");
                    B += scores[i];
                }
            }
        }
        System.out.println("Player A: " + A + " point(s).");
        System.out.println("Player B: " + B + " point(s)");
    }
}

/*
three
seven
queen
eight
five
ten
king
eight
jack
queen
six
queen
jack
eight
seven
three
ten
four
king
nine
six
seven
ace
four
jack
ace
ten
nine
ten
queen
ace
king
seven
two
five
two
five
nine
three
king
six
eight
jack
six
five
four
two
ace
four
three
two
nine
 */