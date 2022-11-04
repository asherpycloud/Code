package CCL2.C20220917;

import java.util.Scanner;

public class P1ColdCompress {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<N;i++){
            String line = sc.nextLine();
            char cur = 0;
            int cnt = 0;
            cur = line.charAt(0);
            cnt++;
            for(int j = 1; j<line.length(); j++){
                if(line.charAt(j) == cur) {
                    cnt++;
                }else{
                    System.out.print(cnt + " " + cur + " ");
                    cur = line.charAt(j);
                    cnt = 1;
                }
            }
            System.out.print(cnt + " " + cur + " ");
            System.out.println();
        }
    }
}

/*
4
+++===!!!!
777777......TTTTTTTTTTTT
(AABBC)
3.1415555

 */


//https://dmoj.ca/problem/ccc19j3