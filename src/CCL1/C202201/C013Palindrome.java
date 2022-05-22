//package CCL1.C202201;
//
//import java.util.Scanner;
//
//public class C013Palindrome {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        for (int j = 0; j < 5; j++) {
//            String line = sc.nextLine();
//            String[] arr = line.split(", ");
//            String number = arr[0];
//            int base = Integer.valueOf(arr[1]);
//            boolean found = false;
//            for (int i = 0; i < 11; i++) {
//                if (isPalindrome(number)) {
//                    System.out.println(number);
//                    found = true;
//                    break;
//                } else {
//                    String number_r = reverse(number);
//                    long sum = Long.parseLong(number, base) + Long.parseLong(number_r, base);
//                    number = Long.toString(sum, base).toUpperCase();
//                }
//            }
//            if (!found) System.out.println("NONE, " + number);
//        }
//    }
//    static boolean isPalindrome(String str){
//        int s = 0, e = str.length() - 1;
//        while(s<e){
//            if(str.charAt(s) == str.charAt(e)){
//                s++; e--;
//            } else{
//                return false;
//            }
//        }
//        return true;
//    }
//
//    static String reverse(String str){
//        char[] arr = new char[str.length()];
//        for(int i = 0; i<str.length(); i++){
//            arr[i] = str.charAt(str.length() - i - 1);
//        }
//        return String.valueOf(arr);
//    }
//}
//
///*
//A23, 16
//A345, 12
//196, 10
//6A, 16
//5896, 13
//8769, 15
//46894, 10
//AAB4, 12
//
// */
