package CCL1.C202201;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.jar.JarEntry;

public class C018Email {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i<N; i++){
            String S = sc.next().toLowerCase();
            char[] email = new char[S.length()];
            int k = 0;
            int pos = S.indexOf('@');
            boolean plus = false;
            for(int j = 0; j < S.length(); j++){
                if(S.charAt(j) == '.' && j < pos) continue;
                else if(S.charAt(j) == '+' && j < pos){
                    plus = true;
                    continue;
                } else if(S.charAt(j) == '@') plus = false;
                if(!plus) {
                    email[k] = S.charAt(j);
                    k++;
                }
            }
            set.add(String.valueOf(email).trim());
        }
        System.out.println(set.size());
    }
}

/*
3
foo@bar.com
fO.o+baz123@bAR.com
foo@bar..com

3
c++@foo.com
c...@Foo.com
.c+c@FOO.COM
 */