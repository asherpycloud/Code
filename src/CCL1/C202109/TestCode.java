package CCL1.C202109;

import java.util.Iterator;
import java.util.Stack;
import java.util.stream.Stream;

public class TestCode {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        stack.push("123");
        stack.push("456");
        stack.push("789");
        stack.push("Hallo");
        String topElement = stack.pop();
        System.out.println(topElement);
        topElement = stack.peek();
        int index = stack.search("123");
        int size = stack.size();
        Iterator iterator = stack.iterator();
        while(iterator.hasNext()){
            Object value = iterator.next();
            System.out.println(value);
        }
        Stream stream = stack.stream();
        stream.forEach((element) -> {
            System.out.println(element); //print element
        });
    }
}
