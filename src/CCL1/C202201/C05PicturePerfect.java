package CCL1.C202201;

import java.util.Scanner;

public class C05PicturePerfect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int C = sc.nextInt(); //numbers of pictures
            if(C == 0)break;
            else{
                double sr = Math.sqrt(C);
                for(int i = (int)sr; i>0; i--){
                    if(C%i == 0){
                        int j = C/i;
                        int peri = (j+i)*2;
                        System.out.println("Minimum perimeter is " + peri + " with dimensions " + i + " x " + j);
                        break;
                    }
                }
            }
        }
    }
}
