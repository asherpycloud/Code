import java.util.Scanner;

public class Problem3nPlus1 {
    public static void main(String[] args){
//        getAnswer(113383);
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(), j = sc.nextInt(), max = 0;
        for(int x = i; x<=j; x++){
            int a = getAnswer(x);
            if (a>max) max = a;
//            System.out.println(x + " " + a);
        }
        System.out.println(i + " " + j + " " + max);
    }
    static int getAnswer(long n){
        int cnt = 1;
        while(n!=1){
            if(n%2 == 1) n = n*3+1;
            else n = n/2;
            cnt++;
//            System.out.println(cnt);
        }
        return cnt;
    }
}
