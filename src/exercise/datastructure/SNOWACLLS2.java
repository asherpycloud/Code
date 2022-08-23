package exercise.datastructure;

import java.util.Scanner;

public class SNOWACLLS2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++){
            String num = sc.nextLine();
            StringBuilder sb = new StringBuilder(); //buffer. Loads stuff
            for (int j=0; j< num.length() && sb.length() < 12; j++) {
                char chr = num.charAt(j); //
                if(chr >= '0' && chr <= '9') {
                    sb.append(chr);
                    if (sb.length() == 3 || sb.length() == 7)
                        sb.append('-');
                } else if (chr >= 'A' && chr <= 'Z') {
                    int ret = (chr - 'A') / 3 + 2; // common rule
                    if ("SVYZ".indexOf(chr) >= 0) // exceptions
                        ret -= 1;
                    sb.append(ret);
                    if (sb.length() == 3 || sb.length() == 7)
                        sb.append('-');
                }
            }
            System.out.println(sb.toString());
        }
    }
}
/*
5
88-SNOW-5555
519-888-4567
BUY-MORE-POP
416-PIZZA-BOX
5059381123

 */