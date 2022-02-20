package CCL1.C202109;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class C014WhoIsTaller {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //number of people
        int M = sc.nextInt(); //number of comparisons that have been done
        C014Student[] students = new C014Student[N];
        for(int i = 0; i<M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            //student factory
            if(students[x] == null) students[x] = new C014Student(x);
            if(students[y] == null) students[y] = new C014Student(y);
            students[x].children.add(students[y]);
            students[y].parents.add(students[x]);


        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        boolean found = false;
        LinkedList<C014Student> list = new LinkedList();
        list.add(students[p]);
        while(!list.isEmpty() && !found){
            C014Student student = list.pop();
            for(C014Student child:student.children){
                if(child.id == q){
                    found = true;
                    break;
                } else{
                    list.add(child);
                }
            }
        }
        if(found) System.out.println("yes");
        else {
            list.clear();
            while(!list.isEmpty() && !found){
                C014Student student = list.pop();
                for(C014Student parent:student.parents){
                    if(parent.id == q){
                        found = true;
                        break;
                    } else{
                        list.add(parent);
                    }
                }
            }
            if(found) System.out.println("no");
            else System.out.println("unknown");
        }
    }
}

/*
10 3
8 4
3 8
4 2
3 2

 */

/*
10 3
3 8
2 8
3 4
3 2

 */