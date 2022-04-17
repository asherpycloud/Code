package CCL1.C202201;

import java.util.Scanner;

public class C0129966 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = m; i<=n; i++){
            String s = String.valueOf(i);
            boolean valid = true;
            for(int b = 0, e = s.length() - 1; valid && b <= e; b++, e--){
                if(!isValid(s.charAt(b), s.charAt(e))) valid = false;
            }
            if(valid) cnt++;
        }
        System.out.println(cnt);
    }
    static boolean isValid(char a, char b){
        if(a == b && "018".indexOf(a) >= 0) return true;
        else if((a == '6' && b=='0') || (a == '9' && b == '6')) return true;
        else return false;
    }
}
