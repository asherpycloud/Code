package CCL2.C20220917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class P06AllIsBalanced {
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
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
    public static void main(String[] args) throws IOException{
        for(int t = 1; t<=5; t++){
            char[] s = readLine().toCharArray();
            Stack<Character> stk = new Stack<>();
            boolean balance  = true;
            for(char c : s){
                if(c == '{' || c == '(' || c == '['){
                    stk.push(c);
                }else if(c == '}'){
                    if(stk.empty() || stk.peek() != '{'){
                        balance = false; break;
                    }else stk.pop();
                }else if(c==')'){
                    if(stk.empty()|| stk.peek() != '('){
                        balance = false; break;
                    }else stk.pop();
                }else if(c == ']'){
                    if (stk.empty() || stk.peek() != '[') {
                        balance = false; break;
                    }else stk.pop();
                }
            }
            if(balance && stk.isEmpty()) System.out.println("balanced");
            else System.out.println("not balanced");
        }
    }
}

/*
abc
([{a}b]c)
)(
([)]
{abc]

 */

//https://dmoj.ca/problem/dwite07c2p4