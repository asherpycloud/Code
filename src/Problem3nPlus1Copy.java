import java.util.Scanner;

public class Problem3nPlus1Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int max = 0;
        for(int x = i; x<=j; x++) {
            int a = getAnswer(x);
            if(a>max) max = a;
        }
        System.out.println(i + " " + j + " " + max);
//        System.out.println(getAnswer(22));
    }
    static int getAnswer(long n) {
        int cnt = 1;
        while (n != 1) {
            if (n % 2 == 1) n = n * 3 + 1;
            else n = n / 2;
            cnt++;
//            System.out.println(cnt);
        }
        return cnt;
    }
}

