package CCL1.C202109;

import java.util.Iterator;
import java.util.Stack;
import java.util.stream.Stream;

public class TestCode {
    public static void main(String[] args){
        C013Light light1 = new C013Light();
        C013Light light2 = new C013Light(true, true, "red");
        System.out.println(light2);
        light2.setColor("purple");
        System.out.println(light2);
        light2.flip();
        System.out.println(light2);
        String color = light2.getColor();
        System.out.println(color);
        boolean on = light2.isOn();
        System.out.println(on);
        light2.burnOut();
        System.out.println(light2);
        System.out.println(light1);
    }
}




