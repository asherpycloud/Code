package CCL1.C202107;

import java.util.Arrays;

public class CarAndCdrAsserts {
    public static int[] cdr(int[] MyArray) {
        int k = MyArray.length;
        assert(k > 0);
        assert(k == MyArray.length);
        int[] answer = Arrays.copyOfRange(MyArray,  1, MyArray.length);
        assert(k == answer.length - 1);
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {2,4,6,8,10};
        System.out.println(Arrays.toString(cdr(a)));
    }
}