package CCL1.C202109;

import java.util.Scanner;

public class C03MessageDeciphering {
    public static void main(String[] args){
        double[] probabilities = { //probabilities of numbers
                0.082, 0.015, 0.028, 0.043, 0.127, 0.022, 0.020,
                0.061, 0.070, 0.002, 0.008, 0.040, 0.024, 0.067,
                0.075, 0.019, 0.001, 0.060, 0.063, 0.091,
                0.028, 0.010, 0.023, 0.001, 0.020, 0.001
        };

        char[] loop_array = { //These are all the letters
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        //To read input:
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] encoded_lines = new String[n];
        for(int i = 0; i<n; i++){ //to read all of your input
            encoded_lines[i] = sc.nextLine();
        }

        //to decode:
        for (int i=0; i<n; i++) { //To decode line by line
            String line = encoded_lines[i]; //this is your input
            String decoded_line = null; //To save the decoded line
            double max_probability = 0.0; //the starting and smallest value for probability
            for(int k=0; k<26; k++){ //To find different k values, from zero to 25
                double probability = 1.0; //
                char[] decoded_chars = new char[line.length()]; //to save your decoded characters
                for(int j=0; j < line.length(); j++){ //to process character by character
                    if(line.charAt(j) == ' '){ //this is to skip spaces
                        decoded_chars[j] = ' '; //this is to skip spaces
                    } else {
                        int pos_in_second_set = line.charAt(j) - 'A' + 26; //Finding its position in the array
                        decoded_chars[j] = loop_array[pos_in_second_set - k];
                        probability *= probabilities[decoded_chars[j] - 'A'];
                    }
                }
                //you want to keep the biggest probability
                System.out.println(k + ":" + String.valueOf(decoded_chars) + " probability:" + probability);
                if(probability > max_probability) {
                    max_probability = probability; //is probability if great that max_probability, then they switch
                    decoded_line = String.valueOf(decoded_chars); //Switch the array to a string after finding a larger probability, which could also be your answer
                }
            }
            System.out.println(decoded_line); //to print output

        }
    }
}


/*
2
ZNK LARR SUUT XOYOTM OY G HGJ YOMT
FA NQ AD ZAF FA NQ FTMF UE FTQ CGQEFUAZ
 */