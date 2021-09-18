package CCL1.C202107;

public class HomeworkExercise {
    public static void main(String[] args){
        catalan(2);
        for(int i = 1; i<=100; i++) {
            long s = System.nanoTime();
            //System.out.println(s);
            catalan(i);
            long e = System.nanoTime();
            //System.out.println(e);
            long d = e - s;
            System.out.println("n=" + i + " time= " + d + " nano seconds");
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

