package CCL1.C202107;

import java.util.ArrayList;
import java.util.Scanner;

public class InClassExercise2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> in = new ArrayList<Double>();
        while(true){
            double d = sc.nextDouble();
            if(d == 0) break;
            in.add(d);
        }
        if (in.size()%2 == 1){
            System.out.println(in.get(in.size()/2));
        } else {
            int i = in.size()/2;
            double m = (in.get(i) + in.get(i-1))/2;
            System.out.println(m);
        }
    }
}