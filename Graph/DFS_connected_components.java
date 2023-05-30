package Graph;

import  java.util.*;
public class DFS_connected_components {

    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static  void createGraph(ArrayList<Edge>[] graph){     // O(V+E)
        for (int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
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

    public static void dfs(ArrayList<Edge>[] graph){
        boolean visit[]= new boolean[graph.length];
        for (int i=0; i< graph.length; i++){
            dfsutil(graph, i, visit);
        }
    }
    public static void dfsutil(ArrayList<Edge>[] graph, int curr, boolean visit[]) {
        System.out.println(curr + " ");
        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visit[e.dest]) {
                dfsutil(graph, e.dest, visit);
            }
        }
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
        dfsutil(graph, 0, new boolean[V]);
    }
}


/*

output
0
1
3
5
6
4
2

 */