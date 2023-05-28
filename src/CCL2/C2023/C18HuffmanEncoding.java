package CCL2.C2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C18HuffmanEncoding {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException{
        int k = readInt();
        Node root = new Node();
        for(int i = 0; i < k; i++){
            String s1 = next(), s2 = next();
            Node node = root;
            for(int j = 0; j< s2.length(); j++){
                char c = s2.charAt(j);
                if(c == '0'){
                    if(node.l == null) node.l = new Node();
                    node = node.l;
                }else{
                    if(node.r == null) node.r = new Node();
                    node = node.r;
                }
            }
            node.v = s1.charAt(0);
        }
        String input = next();
        Node node = root;
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(c == '0') {
                if(node.l == null){
                    System.out.print(node.v);
                    node = root.l;
                }else{
                    node = node.l;
                }
            }else {
                if (node.r == null) {
                    System.out.print(node.v);
                    node = root.r;
                } else {
                    node = node.r;
                }
            }
        }
        System.out.print(node.v);
    }

    static class Node{
        Node l, r;
        char v;
    }
}
