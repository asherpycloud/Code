package CCCprep2023;

import java.util.Scanner;

public class J2SilentAuction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String bidder = "";
        int bid = 0;
        String winner = "";
        int winbid = 0;
        for(int i = 0 ;i <N; i++){
            bidder = sc.next();
            bid = sc.nextInt();
            if(bid > winbid && bid != winbid) {
                winbid = bid;
                winner = bidder;
            }
        }
        System.out.println(winner);
    }
}
