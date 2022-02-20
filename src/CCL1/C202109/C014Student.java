package CCL1.C202109;

import java.util.ArrayList;

public class C014Student {
    int id = 0;
    ArrayList<C014Student> children = new ArrayList();
    ArrayList<C014Student> parents = new ArrayList();

    public C014Student(int pid){
        id = pid;
    }
}
