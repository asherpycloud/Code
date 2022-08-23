package CCL1.C202201;

import java.util.*;

public class C019Highway {
    public static class To implements Comparable<To>{
        int y, c;
        To(int py, int pc){
            y = py; c = pc;
        }

        @Override
        public int compareTo(To o){
            return c - o.c;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //Number of houses
        int M = sc.nextInt(); //Number of roads
        int A = sc.nextInt(); //starting city
        int B = sc.nextInt(); //ending city
        HashMap<Integer, ArrayList<To>> map = new HashMap<>();
        for(int i = 0; i<M; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int c = sc.nextInt();
            if(!map.containsKey(X)) map.put(X, new ArrayList<>());
            map.get(X).add(new To(Y, c));
            if(!map.containsKey(Y)) map.put(Y, new ArrayList<>());
            map.get(Y).add(new To(X, c));
        }
        boolean[] visited = new boolean[N+1];
        int[] costs = new int[N+1];
        for(int i = 0; i<N+1; i++) costs[i] = Integer.MAX_VALUE;
        costs[A] = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(A);
        while(!set.isEmpty()){
            int cost = costs[B];
            int node = -1;
            for(Integer n : set){
                if (costs[n] < cost && !visited[n] && n != B){ cost = costs[n]; node = n; }
            }
            if (node == -1) break;

            set.remove(node);
            visited[node] = true;
            for(To to : map.get(node)){
                set.add(to.y);
                if(costs[node] + to.c < costs[to.y])
                costs[to.y] = costs[node] + to.c;
            }
        }
        if(costs[B] == Integer.MAX_VALUE) System.out.println("NONE");
        else System.out.println(costs[B]);
    }
}

/*
4 2 1 4
1 2 5
3 4 5

4 4 1 4
1 2 5
2 3 5
3 4 5
4 2 6

 */