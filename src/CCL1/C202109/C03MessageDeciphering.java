package CCL1.C202109;

import java.util.Scanner;

public class C03MessageDeciphering {
    public static void main(String[] args){
        double[] probabilities = {
                0.082, 0.015, 0.028, 0.043, 0.127, 0.022, 0.020,
                0.061, 0.070, 0.002, 0.008, 0.040, 0.024, 0.067,
                0.075, 0.019, 0.001, 0.060, 0.063, 0.091,
                0.028, 0.010, 0.023, 0.001, 0.020, 0.001
        };

        char[] loop_array = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'

        };

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] encoded_lines = new String[n];
        for(int i = 0; i<n; i++){
            encoded_lines[i] = sc.nextLine();
        }

        for (int i=0; i<n; i++) {
            String line = encoded_lines[i];
            String decoded_line = null;
            double max_probability = 0.0;
            for(int k=0; k<26; k++){
                double probability = 1.0;
                char[] decoded_chars = new char[line.length()];
                for(int j=0; j < line.length(); j++){
                    if(line.charAt(j) == ' '){
                        decoded_chars[j] = ' ';
                    } else {
                        int pos_in_second_set = line.charAt(j) - 'A' + 26;
                        decoded_chars[j] = loop_array[pos_in_second_set - k];
                        probability *= probabilities[decoded_chars[j] - 'A'];
                    }
                }
                if(probability > max_probability) {
                    max_probability = probability;
                    decoded_line = String.valueOf(decoded_chars);
                }
            }
            System.out.println(decoded_line);

        }
    }
}

/*
2
ZNK LARR SUUT XOYOTM OY G HGJ YOMT
FA NQ AD ZAF FA NQ FTMF UE FTQ CGQEFUAZ
 */