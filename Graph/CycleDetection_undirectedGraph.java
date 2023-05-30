package Graph;

import java.util.*;
public class CycleDetection_undirectedGraph {       //O(V+E)
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

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));

    }

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean visit[]= new boolean[graph.length];
        for (int i=0; i< graph.length; i++){
            if (!visit[i]){
                if(detectCycleutil(graph, visit, i, -1)) {
                    return true;
                    //cycle exist in one of the parts
                }
            }
        }
        return false;
    }

    public static boolean detectCycleutil(ArrayList<Edge>[] graph, boolean visit[], int curr, int parent){
        visit[curr]= true;;
        for (int i=0;i<graph[curr].size(); i++){
            Edge e= graph[curr].get(i);
            if (!visit[e.dest]){
                if (detectCycleutil(graph, visit, e.dest, curr))
                    return true;
            }
            else if (visit[e.dest] && e.dest!=parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*

       0--------3
     / |        |
    /  |        |
   1   |        4
    \  |
     \ |
       2

        */


        int V=5;
        ArrayList<Edge>[] graph= new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}

/*

output
true

*/