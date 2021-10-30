package CCL1.C202109;

import java.util.Scanner;

public class C07BinaryStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int limit = 1<<k;
        for(int i = 0; i<limit; i++){
            //change it to a binary arr
            String binaryString = Integer.toBinaryString(i);
            if (isValid(binaryString)){
                if(binaryString.length() < k){
                    //add the needed amount of 0's
                    for(int j = 0; j<k-binaryString.length(); j++){
                        System.out.print("0");
                    }
                }
                System.out.println(binaryString);
            }
        }
    }

    public static boolean isValid(int[] in){
        /// write your logic here
        for(int i = 0; i<in.length-1; i++){
            if(in[i] == in[i+1] && in[i] == 1) return false;
        }
        return true;
    }
    public static boolean isValid(String in){
        /// write your logic here
        for(int i = 0; i<in.length()-1; i++){
            if(in.charAt(i) == in.charAt(i+1) && in.charAt(i) == '1') return false;
        }
        return true;
    }
}
