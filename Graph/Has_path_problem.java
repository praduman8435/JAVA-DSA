package Graph;

import  java.util.*;

//path exist for source to destination or not( given->source & destination )

public class Has_path_problem {
    static class Edge{
        int src;
        int des;
        int wt;
        public Edge(int s, int d, int w){
            this.src=s;
            this.des=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0; i< graph.length;i++) {
            graph[i] = new ArrayList<>();
        }

            graph[0].add(new Edge(0,1,1));
            graph[0].add(new Edge(0,2,1));

            graph[1].add(new Edge(1,0,1));
            graph[1].add(new Edge(1,3,1));

            graph[2].add(new Edge(2,0,1));
            graph[2].add(new Edge(2,4,1));

            graph[3].add(new Edge(3,1,1));
            graph[3].add(new Edge(3,5,1));
            graph[3].add(new Edge(3,4,1));

            graph[4].add(new Edge(4,3,1));
            graph[4].add(new Edge(4,5,1));
            graph[4].add(new Edge(4,2,1));

            graph[5].add(new Edge(5,6,1));
            graph[5].add(new Edge(5,4,1));
            graph[5].add(new Edge(5,3,1));

            graph[6].add(new Edge(6,5,1));
        }

    
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int des, boolean visit[]) {
        if (src == des) {
            return true;
        }
        visit[src]=true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!visit[e.des] && hasPath(graph, e.des, des, visit)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        /*

              1----3
             /     | \
            0      |  5--6
             \     | /
              2----4

        */

        int V=7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(hasPath(graph, 2, 6, new boolean[V]));
        System.out.println(hasPath(graph, 6, 0, new boolean[V]));
        System.out.println(hasPath(graph, 6, 7, new boolean[V]));
    }
}

/*

output
true
true
false

 */