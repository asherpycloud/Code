package CCL1.C202109;

import java.util.Scanner;

public class C012UniqueSnowflakes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //number of test cases
        for(int i =0; i<T; i++){
            int n = sc.nextInt(); //number of snowflakes
            int[] sf = new int[n]; //array for the snowflakes
            int maxSnowflake = 0; //the biggest snowflake
            for(int j = 0; j<n; j++){
                sf[j] = sc.nextInt();
                if(sf[j] > maxSnowflake) maxSnowflake = sf[j]; //finding the biggest number if sf array
            }
            int[] sfPOS = new int[maxSnowflake + 1];
            for(int j = 0; j<maxSnowflake + 1; j++){ //set everything in sfPOS array to negative one
                sfPOS[j] = -1;
            }
            int cnt = 0, m = 0, s = 0; //counter, max, and starter pos
            for(int j = 0; j<n; j++){
                if (sfPOS[sf[j]] != -1 && sfPOS[sf[j]] >=s){//valid duplicate(needs to be greater than starting point)
                    s = sfPOS[sf[j]] + 1; //change the starting point because there is a duplicate
                    cnt = j-s+1; //reset the counter because the starting point changed
                } else{ //if not a duplicate...
                    cnt++;
                }
                sfPOS[sf[j]] = j; //move index from the first array to the second
                if(cnt > m) m = cnt; //change m if needed
            }
            System.out.println(m);
        }
    }
}

/*
1
5
1
2
3
2
1
 */
