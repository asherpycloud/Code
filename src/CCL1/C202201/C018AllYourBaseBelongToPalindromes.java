package CCL1.C202201;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class C018AllYourBaseBelongToPalindromes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        for(int b = 2; b < X; b++){
            LinkedList<Integer> list = new LinkedList<>();
            int x = X;
            while(x != 0){
                int mod = x % b;
                list.push(mod);
                x = (x - mod) / b;
            }

            //check if it is palindrome
            boolean isPalindrome = true;
            int s = 0, e = list.size() - 1;
            while(s < e){
                if(list.get(s) != list.get(e)){
                    isPalindrome = false;
                    break;
                }
                s++; e--;
            }
            if(isPalindrome)
                System.out.println(b);
        }
    }
}

/*
9

 */
