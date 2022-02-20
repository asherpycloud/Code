package CCL1.C202201;

import java.util.Scanner;

public class C01Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int max = 1;
        for(int i = 0; i<in.length(); i++){
            int s = i-1, e = i+1;
            while(s>=0 && e<in.length() && in.charAt(s) == in.charAt(e)) { s--; e++;}
            int palindrome_len = e - s - 1;
            if(palindrome_len > max) max = palindrome_len;


            if(i>0 && in.charAt(i) == in.charAt(i-1)){
                s = i-2; e = i+1;
                while(s>=0 && e<in.length() && in.charAt(s) == in.charAt(e)) { s--; e++;}
                palindrome_len = e-s-1;
                if(palindrome_len > max) max = palindrome_len;
            }
        }
        System.out.println(max);
    }
}

