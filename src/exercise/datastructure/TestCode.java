package exercise.datastructure;

import java.util.*;

public class TestCode {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                {3, 4, 5},
                {3, 4, 6},
                {2, 3, 4},
                {3, 3, 4},
                {1, 1, 1},
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 1000000}
        };
        for (int i=0; i<arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
        Arrays.sort(arr, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                int vola = a[0] * a[1] * a[2];
                int volb = b[0] * b[1] * b[2];
                return vola - volb;
            }
        });
        System.out.println("===========================");
        for (int i=0; i<arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
    }


}
