package CCL1.C202201;

import java.util.Scanner;

public class C021Xyene {
    public static void main(String[] arsg){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[] nums = new int[N+1];
        int GCD = 0;
        for(int i = 1; i <= N; i++) {
            nums[i] = sc.nextInt();
        }
        for(int i = 0; i<M; i++){
            String operation = sc.next();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if(operation.equals("C")){
                nums[num1] = num2;
            }else if(operation.equals("M")){
                int lowest = Integer.MAX_VALUE;
                for(int j = num1; j<=num2; j++){
                    if (nums[j] < lowest) lowest = nums[j];
                }
                System.out.println(lowest);
            }else if(operation.equals("G") || operation.equals("Q")) {
                GCD = gcdByEuclidsAlgorithm(nums[num1], nums[num1 + 1]);
                for (int j = num1 + 2; j <= num2; j++) {
                    GCD = gcdByEuclidsAlgorithm(GCD, nums[j]);
                }
                if (operation.equals("G")) System.out.println(GCD);
                else {
                    int cnt = 0;
                    for (int j = num1; j <= num2; j++) {
                        if (nums[j] == GCD) cnt++;
                    }
                    System.out.println(cnt);
                }
            }
        }
    }

    static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
/*
5 5
1 1 4 2 8
C 2 16
M 2 4
G 2 3
C 2 1
Q 1 5

 */

/*
5 2
1 1 2 2 2
Q 1 4
Q 3 5

 */