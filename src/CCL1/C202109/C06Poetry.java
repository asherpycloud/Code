package CCL1.C202109;

import java.util.Scanner;

public class C06Poetry {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<N; i++){
            String[] ss = new String[4];
            for(int j = 0; j<4; j++){
                //read the input
                String line = sc.nextLine();
                //find the last vowel
                for(int k = line.length()-1; k>=0; k--){
                    if(line.charAt(k) == 'a' || line.charAt(k) == 'e' || line.charAt(k) == 'i' || line.charAt(k) == 'o' || line.charAt(k) == 'u'){
                        //get the last syllable
                        ss[j] = line.substring(k+1);
                        break;
                    }
                }
            }
            //classify rhyme
            if(ss[0].equals(ss[1]) && ss[0].equals(ss[2]) && ss[0].equals(ss[3])) System.out.println("perfect");
            else if(ss[0].equals(ss[1]) && ss[2].equals(ss[3])) System.out.println("even");
            else if(ss[0].equals(ss[2]) && ss[1].equals(ss[3])) System.out.println("cross");
            else if(ss[0].equals(ss[3]) && ss[1].equals(ss[2])) System.out.println("shell");
            else System.out.println("free");
        }
    }
}

/*
1
One plus one is small
one hundred plus one is not
you might be very tall
but summer is not

2
I say to you boo
You say boohoo
I cry too
It is too much foo
Your teacher has to mark
and mark and mark and teach
To do well on this contest you have to reach
for everything with a lark

2
It seems though
that without some dough
creating such a bash
is a weighty in terms of cash
But how I see
the problem so fair
is to write subtle verse
with hardly a rhyme

*/