package exercise.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class BOXES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] boxes = new int[n][3];
        for (int i = 0; i < n; i++) {
            boxes[i][0] = sc.nextInt();
            boxes[i][1] = sc.nextInt();
            boxes[i][2] = sc.nextInt();
            Arrays.sort(boxes[i]);
        }

        Arrays.sort(boxes, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                int vola = a[0] * a[1] * a[2];
                int volb = b[0] * b[1] * b[2];
                return vola - volb;
            }
        });

        int m = sc.nextInt();
        int[] item = new int[3];
        for (int i = 0; i < m; i++) {
            item[0] = sc.nextInt();
            item[1] = sc.nextInt();
            item[2] = sc.nextInt();
            Arrays.sort(item);
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (boxes[j][0] >= item[0] && boxes[j][1] >= item[1] && boxes[j][2] >= item[2]) {
                    System.out.println(1L * boxes[j][0] * boxes[j][1] * boxes[j][2]);
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.println("Item does not fit.");
        }
    }
}

/*
3
1 2 3
2 3 4
3 4 5
5
1 1 1
2 2 2
4 3 2
4 3 3
4 4 4

 */
