package CCL1.C202201;

import java.util.Scanner;

public class C06HuffmanEncoding {
    static class Node{
        Node left, right;
        String value;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Node root = new Node();
        for(int i = 0; i<k; i++){
            String v = sc.next(); //Value
            String path = sc.next(); //Path
            Node node = root;
            for(int j = 0; j<path.length();j++){ //reading path and determining the right conclusion
                if(path.charAt(j) == '0') {
                    if(node.left == null) node.left = new Node();
                    node = node.left;
                }else{
                    if(node.right == null) node.right = new Node();
                    node = node.right;
                }
            }
            node.value = v;
        }
        String line = sc.next();
        Node node = root;
        for(int i = 0; i<line.length(); i++){
            if(line.charAt(i) == '0') {
                node = node.left;
            }else{
                node = node.right;
            }
            if(node.value != null){
                System.out.print(node.value);
                node = root;
            }
        }
    }
}

/*
5
A 00
B 01
C 10
D 110
E 111
00000101111

 */
