package CCL1.C202201;

import java.util.HashSet;
import java.util.Scanner;

public class C017SubstringCopy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int k = 0; k<N; k++) {
            String input = sc.next();
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < input.length(); i++) {
                for (int j = i; j < input.length(); j++) {
                    String substr = input.substring(i, j + 1);
                    if (!set.contains(substr)) set.add(substr);
                }
            }
            System.out.println(set.size() + 1);
        }
    }
}
