package CCL1.C202201;

import java.util.Scanner;
import java.util.Stack;

public class C02ProblemDescriptionCopy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<String> backward = new Stack<>();
        Stack<String> forward = new Stack<>();
        String currentPage = "http://www.acm.org/";
        while (true) {
            String cmd = sc.next();
            if(cmd.equals("BACK")){
                if(backward.isEmpty()) {
                    System.out.println("Ignored");
                } else{
                    forward.push(currentPage);
                    currentPage = backward.pop();
                    System.out.println(currentPage);
                }
            } else if(cmd.equals("FORWARD")){
                if(forward.isEmpty()) {
                    System.out.println("Ignored");
                } else {
                    backward.push(currentPage);
                    currentPage = forward.pop();
                    System.out.println(currentPage);
                }
            } else if(cmd.equals("VISIT")){
                backward.push(currentPage);
                currentPage = sc.next();
                forward.clear();
                System.out.println(currentPage);
            } else{ //QUIT
                break;
            }
        }
    }
}

/*
VISIT http://acm.ashland.edu/
VISIT http://acm.baylor.edu/acmicpc/
BACK
BACK
BACK
FORWARD
VISIT http://www.ibm.com/
BACK
BACK
FORWARD
FORWARD
FORWARD
QUIT

 */