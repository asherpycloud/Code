package CCL1.C202201;

import java.util.HashMap;
import java.util.Scanner;

public class C01WERTYU {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Character> map = new HashMap<>();
        String[] lines = new String[] {"`1234567890-=", "QWERTYUIOP[]\\", "ASDFGHJKL;'", "ZXCVBNM,./"};
        for(int i = 0; i<lines.length; i++){ //i is for which String you lookin at
            String line = lines[i];
            for(int j=1;j<line.length(); j++) map.put(line.charAt(j), line.charAt(j-1));
        }

        String in = sc.nextLine();
        char[] out = new char[in.length()];
        for(int i = 0; i<in.length(); i++){
            if(map.containsKey(in.charAt(i))) out[i] = map.get(in.charAt(i));
            else out[i] = map.get(in.charAt(i));
        }
        System.out.println(String.valueOf(out));
    }
}

// O S, GOMR YPFSU/