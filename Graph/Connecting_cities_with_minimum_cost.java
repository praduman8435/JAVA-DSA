/*

Find the minimum cost for connecting all cities on the map

cities[][]= {{0,1,2,3,4},
             {1,0,5,0,7},
             {2,5,0,6,0},
             {3,0,6,0,0},
             {4,7,0,0,0}}

             ans= 10


         (4)    (3)
       4------o-----3
             | \   |
             |  \  |
         (1) |(2)\ |(6)
             |    \|
             1-----2
                (5)

*/

package Graph;
import java.util.*;
public class Connecting_cities_with_minimum_cost {

    static class Edge implements Comparable<Edge>{
        int dest;
        int cost;
        public Edge(int d, int c){
            this.dest= d;
            this.cost= c;
        }

        @Override
        public int compareTo(Edge e2){
            return this.cost-e2.cost;
        }
    }

    public static int connectCities(int cities[][]) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean visit[] = new boolean[cities.length];

        pq.add(new Edge(0, 0));
        int finalCost = 0;

        while (!pq.isEmpty()) {
            Edge curr = pq.remove();
            if (!visit[curr.dest]) {
                visit[curr.dest] = true;
                finalCost += curr.cost;

                for (int i = 0; i < cities[curr.dest].length; i++) {
                    if (cities[curr.dest][i] != 0) {
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalCost;
    }
    public static void main(String[] args) {
        int cities[][]= {{0,1,2,3,4},
                {1,0,5,0,7},
                {2,5,0,6,0},
                {3,0,6,0,0},
                {4,7,0,0,0}};
        System.out.println(connectCities(cities));
    }
}

/*

Output
10

 */