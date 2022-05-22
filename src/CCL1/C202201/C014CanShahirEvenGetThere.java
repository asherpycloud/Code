package CCL1.C202201;

import java.time.Year;
import java.util.*;

public class C014CanShahirEvenGetThere {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //Number of houses
        int M = sc.nextInt(); //Number of roads
        int A = sc.nextInt(); //Shahirs house
        int B = sc.nextInt(); //Shahirs dates house
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i<M; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(!map.containsKey(X)) map.put(X, new ArrayList<>());
            map.get(X).add(Y);
            if(!map.containsKey(Y)) map.put(Y, new ArrayList<>());
            map.get(Y).add(X);
        }

        boolean find = false;
        boolean[] visited = new boolean[N+1];
        LinkedList<Integer> list = new LinkedList<>();
        list.add(A);
        while(!find && !list.isEmpty()) {
            int x = list.pop();
            if(!visited[x]) {
                for(int y : map.get(x)){
                    if(y == B) {
                        find = true;
                        break;
                    } else if(!visited[y]){
                        list.add(y);
                    }
                }
                visited[x] = true;
            }
        }

        if(find) System.out.println("GO SHAHIR!");
        else System.out.println("NO SHAHIR!");
    }
}

/*
6 7 1 6
1 2
2 3
2 5
5 1
3 4
4 5
4 6

 */
