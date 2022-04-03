package CCL1.C202201;

import java.util.HashMap;
import java.util.Scanner;

public class C010CodeBreaker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Character> map = new HashMap<>();
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();
        for(int i = 0; i<line2.length(); i++){
            map.put(line2.charAt(i), line1.charAt(i));
        }
        char[] arr = new char[line3.length()];
        for(int i = 0; i<line3.length(); i++){
            if(map.containsKey(line3.charAt(i))) arr[i] = map.get(line3.charAt(i));
            else arr[i] = '.';
        }
        System.out.println(String.valueOf(arr));
    }
}

/*
THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
UIFARVJDLACSPXOAGPYAKVNQTAPWFSAUIFAMB ZAEPH
XFABSFAWFSZACBEAQFPQMFAEPJOHAWFSZACBEAUIJOHTAIBAIB

 */
/*
THERE ARE NOT ENOUGH LETTERS
XQAZASEZASNYXSANYLWQSTAXXAZM
JSCENNYXSIACYIASXQJM

 */