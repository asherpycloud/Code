package CCCprep2023;

import java.util.Scanner;

public class J3ARageTreeProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0, max = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i<4; i++){
            num = sc.nextInt();
            if(num>max) max = num;
            else if(num<min) min = num;
        }
        System.out.println(min + "\n" + max);
    }
}

/*
1
1
1
1

 */