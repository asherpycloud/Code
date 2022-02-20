package CCL1.C202201;

import java.util.Scanner;

public class C01CellphonePlan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int intNTest = input.nextInt(); // Number of test cases
        for(int i = 0; i< intNTest; i++){
            String str = input.next();
            String strOutput = "";
            String c = str.substring(0, 1);
            int count = 1; //Initially we have at least one letter
            for(int j = 1; j<str.length(); j++){
                if(str.substring(j, j + 1).equals(c)){
                    count++;
                }
                else{
                    strOutput = strOutput + count + " "+ c + " ";
                    count = 1;
                    c = str.substring(j, j+ 1);
                }
            }
            strOutput = strOutput + count + " "+ c + " ";
            System.out.println(strOutput);
        }
    }
}
