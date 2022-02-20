package CCL1.C202201;

import java.util.Scanner;

public class C05Punchy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = 0, B = 0;
        while(true){
            int instruction = sc.nextInt();
            if(instruction == 1){
                String s = sc.next();
                int n = sc.nextInt();
                if(s.equals("A")) A = n;
                else B = n;
            }else if(instruction == 2){
                String s = sc.next();
                if(s.equals("A")) System.out.println(A);
                else System.out.println(B);
            }else if(instruction >=3 && instruction <=6){
                String X = sc.next();
                String Y = sc.next();
                int op1 = (X.equals("A")) ? A : B;
                int op2 = (Y.equals("A")) ? A : B;
                int result = 0;
                if (instruction == 3) result = op1 + op2;
                else if (instruction == 4) result = op1 * op2;
                else if (instruction == 5) result = op1 - op2;
                else result = op1 / op2;
                if (X.equals("A")) A = result;
                else B = result;
            }else if(instruction == 7){
                break;
            }else System.out.println("Invalid Instruction:" + instruction);
        }
    }
}

/*
1 A 3
1 B 4
2 B
2 A
3 A B
2 A
5 A A
2 A
2 B
7

 */