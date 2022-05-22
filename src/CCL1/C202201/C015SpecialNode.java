package CCL1.C202201;
import java.util.*;

public class C015SpecialNode {
    static class To implements Comparable<To>{
        int t, w;
        To(int pt, int pw){
            t = pt; w = pw;
        }
        public int compareTo(To o) {return w - o.w;}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt(), K = sc.nextInt();
        int[] specials = new int[K];
        boolean[] isspecial = new boolean[N + 1];
        for(int i = 0; i <K; i++){
            specials[i] = sc.nextInt();
            isspecial[specials[i]] = true;
        }

        ArrayList<To>[] graph = new ArrayList[N+1];
        for(int i = 0; i <M; i++){
            int x = sc.nextInt(), y = sc.nextInt(), w = sc.nextInt();
            if (graph[x] == null) graph[x] = new ArrayList<>();
            if (graph[y] == null) graph[y] = new ArrayList<>();
            graph[x].add(new To(y, w));
            graph[y].add(new To(x, w));
        }

        int shortest = Integer.MAX_VALUE;
        for(int i = 0; i<K; i++){
            int node = specials[i];
            boolean[] visited = new boolean[N + 1];
            int[] weights = new int[N + 1];
            visited[node] = true;
            PriorityQueue<To> queue = new PriorityQueue<>();
            queue.add(new To(node, 0));
            while(!queue.isEmpty()){
                To to = queue.poll();
                for(To t : graph[to.t]){
                    if(!visited[t.t] && weights[t.t] < shortest){
                        if(weights[t.t] == 0 || weights[to.t] + t.w < weights[t.t])
                            weights[t.t] = weights[to.t] + t.w;
                        if(isspecial[t.t] && weights[t.t] < shortest)
                            shortest = weights[t.t];
                        if(weights[t.t] < shortest)
                            queue.add(new To(t.t, weights[t.t]));
                    }
                }
                visited[to.t] = true;
            }
        }

        System.out.println(shortest);
    }
}

/*
5 5 3
1 3 5
1 2 3
2 3 4
3 4 1
4 5 8
1 5 19

 */
