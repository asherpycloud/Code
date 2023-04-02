import java.util.Scanner;

public class J2ModernArt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean[] row = new boolean[M];
        boolean[] column = new boolean[N];
        int K = sc.nextInt();
        int m = 0;
        int n = 0;
        for(int i = 0 ;i <K; i++){
            String d = sc.next();
            int x = sc.nextInt() - 1;
            if(d.equals("R")){
                if(row[x]){
                    row[x] = false;
                    m--;
                }else{
                    row[x] = true;
                    m++;
                }
            }else{
                if(column[x]){
                    column[x] = false;
                    n--;
                }else{
                    column[x] = true;
                    n++;
                }
            }
        }
        System.out.println(m*N + M*n - 2*m*n);
    }
}
