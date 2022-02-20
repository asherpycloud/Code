package CCL1.C202201;

import java.util.Scanner;

public class C02PostfixNotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] a = line.split(" ");
        double operand1 = Double.valueOf(a[0]);
        for(int i = 1; i<a.length; i+=2) {
            double operand2 = Double.valueOf(a[i]);
            String operator = a[i+1];
            if(operator.equals("*")){
                operand1 = operand1*operand2;
            } else if(operator.equals("/")){
                operand1 = operand1/operand2;
            } else if(operator.equals("+")){
                operand1 = operand1 + operand2;
            } else if(operator.equals("-")){
                operand1 = operand1 - operand2;
            } else if(operator.equals("%")){
                operand1 = operand1 % operand2;
            } else{
                operand1 = (int)operand1 ^ (int)operand2;
            }
        }
        System.out.println(operand1);
    }
}

/*
5 5 +

 */

/*
5 5 + 6 * 8 -

 */
