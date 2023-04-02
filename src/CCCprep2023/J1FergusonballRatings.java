package CCCprep2023;

import java.util.Scanner;

public class J1FergusonballRatings {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), s, f, cnt = 0;
        for(int i = 0 ;i <N; i++){
            s = sc.nextInt();
            f = sc.nextInt();
            if((5*s - 3*f) > 40) cnt++;
        }
        if(cnt == N) System.out.println(cnt + "+");
        else System.out.println(cnt);
    }
}
/*
3
12
4
10
3
9
1

 */