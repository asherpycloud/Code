//package CCL1.C202201;
//
//import java.util.*;
//
//public class C08NatureReserve {
//    static class Edge{
//        int i, j, eij;
//        Edge(int pi, int pj, int peij){
//            i=pi; j=pj; eij=peij;
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int datasets = sc.nextInt();
//        int N = sc.nextInt(); //environmental monitoring station
//        int M = sc.nextInt(); //Communication channels
//        int L = sc.nextInt(); //Bytes
//        int S = sc.nextInt(); //Number of initial stations
//        int markCnt = S;
//        boolean[] marks = new boolean[N];
//        Edge[] edges = new Edge[M];
//        int[] InitialS = new int[S];
//        for(int i = 0; i<S; i++){
//            int s = sc.nextInt();
//            marks[s] = true;
//        }
//        for(int i = 0; i<M; i++){
//            edges[i] = new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt());
//        }
//        Arrays.sort(edges, Comparator.comparing(e -> e.eij));
//
//        int total = 0;
//
//        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
//        for(int i = 0; i<M && markCnt<N; i++){
//            Edge e = edges[i];
//            if(marks[e.i] && marks[e.j]) continue;
//            else if(marks[e.i] || marks[e.j]){
//                total += e.eij + L;
//                if(marks[e.i]) marks[e.j]  = true;
//                else marks[e.i] = true;
//                markCnt++;
//            } else{
//                if(map.containsKey(i)) groupi = map.get(i);
//
//            }
//        }
//    }
//}

/*
The first line contains four positive integers: the number of environmental monitoring stations N, the
number of two-way communication channels M, the size of the program L (in bytes), and the number of
initial stations S. The constraints are 1≤S≤N≤104, 1≤M≤106, M≤N(N−1)/2, and 1≤L≤106.

Sample Input 1
1
4 6 10 1
3
1 2 4
1 3 8
1 4 1
2 3 2
2 4 5
3 4 20
Sample Output 1
37
 */