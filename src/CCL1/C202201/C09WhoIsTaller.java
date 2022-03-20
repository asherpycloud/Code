package CCL1.C202201;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class C09WhoIsTaller {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[] compared = new boolean[N+1];
        ArrayList<Integer>[] graph = new ArrayList[N];
        for(int i = 0; i<M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            compared[x] = true;
            compared[y] = true;
            if(graph[x] == null) graph[x] = new ArrayList<>();
            graph[x].add(y);
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        if(!compared[p] || !compared[q]) System.out.println("unknown");
        else{
            boolean[] marks = new boolean[N];
            HashSet<Integer> lista = new HashSet<>(), listb = new HashSet<>(), listt;
            if(graph[p] != null) lista.addAll(graph[p]);
            while(!lista.isEmpty()) {
                listb.clear();
                for(Integer child : lista){
                    if(child == q){
                        System.out.println("yes");
                        System.exit(0);
                    }
                    if(!marks[child]){
                        if(graph[child] != null) listb.addAll(graph[child]);
                        marks[child] = true;
                    }
                }
                listt =  lista; lista = listb; listb = listt;
            }

            lista.clear();
            if(graph[q] != null) lista.addAll(graph[q]);
            while(!lista.isEmpty()) {
                listb.clear();
                for(Integer child : lista){
                    if(child == p){
                        System.out.println("no");
                        System.exit(0);
                    }
                    if(!marks[child]){
                        if(graph[child] != null) listb.addAll(graph[child]);
                        marks[child] = true;
                    }
                }
                listt =  lista; lista = listb; listb = listt;
            }

            System.out.println("unknown");
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