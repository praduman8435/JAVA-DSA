package Graph;
import java.util.*;
public class Topological_sorting_DFS {

    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    static  void createGraph(ArrayList<Edge>[] graph){     // O(V+E)
        for (int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,0));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

    }

    public static void TopSort(ArrayList<Edge>[] graph){
        boolean visit[]= new boolean[graph.length];
        boolean stack[]= new boolean[graph.length];
        Stack<Integer> s= new Stack<>();
        for (int i=0; i< graph.length; i++){
            if (!visit[i]){
                TopSortutil(graph, i, visit, s);
            }
        }
        while (!s.empty()){
            System.out.println(s.pop()+" ");
        }
    }

    public static void TopSortutil(ArrayList<Edge>[] graph, int curr, boolean visit[], Stack<Integer> s){
        visit[curr]= true;
        for (int i=0; i<graph[curr].size(); i++){
            Edge e= graph[curr].get(i);
            if(!visit[e.dest]){
                TopSortutil(graph, e.dest, visit, s);
            }
        }
        s.push(curr);
    }
    
    public static void main(String[] args) {

        /*

        5----->0<-------4
        |               |
        |               |
        |               |
        2------>3<------1

        */
        int V= 6;
        ArrayList<Edge>[] graph= new ArrayList[V];
        createGraph(graph);
        TopSort(graph);
    }
}
