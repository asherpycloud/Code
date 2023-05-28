//package CCL2.C2023;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class C17PermutationsAndPrimes {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static StringTokenizer st;
//
//    static String next() throws IOException {
//        while (st == null || !st.hasMoreTokens())
//            st = new StringTokenizer(br.readLine().trim());
//        return st.nextToken();
//    }
//    static int readInt() throws IOException {
//        return Integer.parseInt(next());
//    }
//    public static void main(String[] args) throws IOException{
////        int N = readInt(), M = readInt();
////        char[] pw = new char[N];
////        for (int i=0; i<N; i++) pw[i] = 'z';
////        String end = String.valueOf(pw);
////        for (int i=0; i<N; i++) pw[i] = 'a';
////        while (!pw.equals(end)) {
////            System.out.println(s + ":" + get_hash(s));
////        }
////        for (String s = "aaaa"; s.length() < N; i++) {
////            char c = (char) ('a' + i);
////            String s = String.valueOf(c);
////            System.out.println(s + ":" + get_hash(s));
////        }
////    }
////
////    static int get_hash(String s) {
////        int hash = 0;
////        for (int i = 0; i < s.length(); i++) {
////            hash = hash * 13 + s.charAt(i) - 'a' + 1;
////        }
////        return hash;
////    }
//}
