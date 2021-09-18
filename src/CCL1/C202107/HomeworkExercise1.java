package CCL1.C202107;

public class HomeworkExercise1 {
    public static void main(String[ ] args){
        for(int i = 1; i<=21; i++) {
            long s = System.nanoTime();
            catalan(i);
            long e = System.nanoTime();
            long d = e-s;
            System.out.println("n=" + i + " " + d + " nano seconds");
        }
    }

    public static int catalan(int n) {
        if (n<=1){
            return 1;
        } else{
            int r = 0;
            for (int i=0; i<n; ++i){
                r+= catalan(i) * catalan(n-i-1);
            }
            return r;
        }
    }
}
