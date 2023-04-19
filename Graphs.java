import java.lang.Override;
import java.util.*;
import java.util.LinkedList;

public class Graphs {

    static class Edge {
        int src;
        int dist;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dist = d;
            this.wt = w;
        }
    }
    public static void createGraph1() {
        int V = 5;
        /* int arr[] = new arr[V]; */
        ArrayList<Edge>[] graph = new ArrayList[V]; /* null --> empty arraylist */
 
        for(int i=0; i<V; i++) {
         graph[i] = new ArrayList<>();
        }
 
        /* 0 - vertex */
        graph[0].add(new Edge(0, 1, 5));
 
        /* 1 - vertex */
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
 
        /* 2 - vertex */
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));
 
        /* 3 - vertex */
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
 
        /* 4 - vertex */
        graph[4].add(new Edge(4, 2, 2));
 
 
        /* 1's neighours */
        for(int i=0; i<graph[1].size(); i++) {
            Edge e = graph[1].get(i);
            System.out.print(e.dist+" ");
        }

        /* 2's neighours */
        for(int i=0; i<graph[2].size(); i++) {
          Edge e = graph[2].get(i);  /* src, dist, wt */
          System.out.print(e.dist+" ");
 
        }
    }

    public static void createGraph2(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();

        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));


    }
    public static void bfs(ArrayList<Edge>[] graph) { /* O(V+E) */
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0); /* Source = 0 */

        while(!q.isEmpty()) {
            int curr = q.remove();

            if(!vis[curr]) { /* visit curr */
                System.out.println(curr+" ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dist);

                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        /* visit */
        System.out.println(curr+" ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dist]) {
                dfs(graph, e.dist, vis);
            }
        }
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dist, boolean vis[]) {
        /* O(V+E) */
        if(src == dist) return true;

        vis[src] = true;

        for(int i=0; i<graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            /* e.dist => neighour */
            if(!vis[e.dist] && hasPath(graph, e.dist, dist, vis)) {
                return true;
            }
        }
        return false;
    }

    public static void operation1() {

        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph2(graph);
        bfs(graph);
    }
    public static void operation2() {

        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph2(graph);
        dfs(graph, 0, new boolean[V]);
    }
    public static void operation3() {

        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph2(graph);
        
        System.out.println(hasPath(graph, 0, 7, new boolean[V]));
    }


    /* Connected Components */

    /* BFS FOR NOT CONNECTED GRAPH   */
    public static void bfs_cc(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(!vis[i]) {
                bfsUtil(graph, vis);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph, boolean vis[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0); /* Source = 0 */

        while(!q.isEmpty()) {
            int curr = q.remove();

            if(!vis[curr]) { /* visit curr */
                System.out.println(curr+" ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dist);

                }
            }
        }
    }

    /* DFS FOR NOT CONNECTED GRAPH */

    public static void dfs_cc(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            dfsUtil(graph, i, vis);
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        /* visit */
        System.out.println(curr+" ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) { 
            Edge e = graph[curr].get(i);
            if(!vis[e.dist]) {
                dfsUtil(graph, e.dist, vis);
            }
        }
    }

    /* New Edge which does not contains Weight */
    /* *************************************** */

    static class Edge1 {
        int src;
        int dest;

        public Edge1(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph3(ArrayList<Edge1> graph[]) {

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
            graph[0].add(new Edge1(0, 1));
            graph[0].add(new Edge1(0, 2));
            graph[0].add(new Edge1(0, 3));

            graph[1].add(new Edge1(1, 0));
            graph[1].add(new Edge1(1, 2));

            graph[2].add(new Edge1(2, 0));
            graph[2].add(new Edge1(2, 1));
            
            graph[3].add(new Edge1(3, 0));
            graph[3].add(new Edge1(3, 4));

            graph[4].add(new Edge1(4, 3));



        }
       
    
        /* O(V+E) */
    public static boolean detectCycle(ArrayList<Edge1>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(!vis[i]) {
               if(detectCycleUtil(graph, vis, i, -1))
               return true;
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge1>[] graph, boolean vis[], int curr, int par) {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge1 e = graph[curr].get(i);

            /* case 3 */
            if(!vis[e.dest] ) {
                if(detectCycleUtil(graph, vis, e.dest, curr))
                return true;
            }
            /* case 1 */
            else if(vis[e.dest] && e.dest != par) {
                return true;
            }
            /* case 2 --> do nothing --> continue */
        }
        return false;
    }

    public static void main1() {
        int V = 5;
        ArrayList<Edge1> graph[] = new ArrayList[V];
        createGraph3(graph);

        System.out.println(detectCycle(graph));
    }

    public static void createGraph4(ArrayList<Edge1> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge1(0, 1));
        graph[0].add(new Edge1(0, 2));

        graph[1].add(new Edge1(1, 0));
        graph[1].add(new Edge1(1, 3));

        graph[2].add(new Edge1(2, 0));
        graph[2].add(new Edge1(2, 4));

        graph[3].add(new Edge1(3, 1));
        graph[3].add(new Edge1(3, 4));
        
        graph[4].add(new Edge1(4, 2));
        graph[4].add(new Edge1(4, 3));

    }

    
    public static boolean isBipartite(ArrayList<Edge1>[] graph) {
        int col[] = new int[graph.length];
        for(int i=0; i<col.length; i++) {
            col[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<graph.length; i++) {
            if(col[i] == -1) {  /* BFS */
                q.add(i);
                col[i] = 0; /* Yellow */
                while(!q.isEmpty()) {
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++) {
                        Edge1 e = graph[curr].get(j); /* e.dest */
                        if(col[e.dest] == -1) {
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if(col[e.dest] == col[curr]) {
                            return false; /* NOT BIPARTITE */
                        }
                    }
                }
            }
        }

        return true;

    }
    public static void main2() {
        /* if graph doesn't have cycle then it is bipartite */
        /* ACYCLIC OR EVEN CYCLE  */
        /* ODD CYCLE not bipartite */
        int V = 5;
        ArrayList<Edge1> graph[] = new ArrayList[V];
        createGraph4(graph);
        System.out.println(isBipartite(graph));
    }

    static void createGraph5(ArrayList<Edge1> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge1(0, 2));

        graph[1].add(new Edge1(1, 0));

        graph[2].add(new Edge1(2, 3));

        graph[3].add(new Edge1(3, 0));

    }

    public static boolean isCycle(ArrayList<Edge1>[] graph) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++) {
            if(!vis[i]) {
                if(isCycleUtil(graph, i, vis, stack)){
                    return true;
                }
                
            }
        }
        return true;
    }

    public static boolean isCycleUtil(ArrayList<Edge1>[] graph, int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge1 e = graph[curr].get(i);
            if(stack[e.dest]) {  /* Cycle exist */
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack))
            return true;
        }

        stack[curr] = false;
        return false;
    }
    public static void main3() {
        int V = 5;
        ArrayList<Edge1> graph[] = new ArrayList[V];
        createGraph5(graph);
        System.out.println(isCycle(graph));
    }

    static void createGraph6(ArrayList<Edge1> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge1(2, 3));
        
        graph[3].add(new Edge1(3, 1));

        graph[4].add(new Edge1(4, 0));
        graph[4].add(new Edge1(4, 1));

        graph[5].add(new Edge1(5, 0));
        graph[5].add(new Edge1(5, 2));

    }

    public static void topSort(ArrayList<Edge1>[] graph) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++) {
            if(!vis[i]) {
                topSortUtil(graph, i, vis, s); /* modified dfs */
            }
        }

        while(!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge1> graph[], int curr, boolean vis[], Stack s) {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge1 e = graph[curr].get(i);
            if(!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void main4() {
        int V = 6;
        ArrayList<Edge1> graph[] = new ArrayList[V];
        createGraph6(graph);
        topSort(graph);
    }

    public static void createGraph7(ArrayList<Edge1> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge1(2, 3));

        graph[3].add(new Edge1(3, 1));

        graph[4].add(new Edge1(4, 0));
        graph[4].add(new Edge1(4, 1));

        graph[5].add(new Edge1(5, 0));
        graph[5].add(new Edge1(5, 2));


    }

    public static void calcIndeg(ArrayList<Edge1> graph[], int indeg[]) {
        for(int i=0; i<graph.length; i++) {
            int v = i;
            for(int j=0; j<graph[v].size(); j++) {
                Edge1 e = graph[v].get(j);
                indeg[e.dest]++; /* ISKO SAMJHE */
            }
        }
    }

    public static void topSort1(ArrayList<Edge1> graph[]) {
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<indeg.length; i++) {
            if(indeg[i] == 0) {
                q.add(i);
            }
        }
        /* bfs  */
        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr+" "); /* topology sort */

            for(int i=0; i<graph[curr].size(); i++) {
                Edge1 e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void main5() {
        int V = 6;
        ArrayList<Edge1> graph[] = new ArrayList[V];
        createGraph7(graph);

        topSort1(graph);
    }

    public static void createGraph8(ArrayList<Edge1> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge1(0, 3));

        graph[2].add(new Edge1(2, 3));

        graph[3].add(new Edge1(3, 1));

        graph[4].add(new Edge1(4, 0));
        graph[4].add(new Edge1(4, 1));

        graph[5].add(new Edge1(5, 0));
        graph[5].add(new Edge1(5, 2));

    }

    public static void printAllPath(ArrayList<Edge1> graph[], int src, int dest, String path) {
        if(src == dest) {
            System.out.println(path+dest);
            return;
        }

        for(int i=0; i<graph[src].size(); i++) {
            Edge1 e = graph[src].get(i);
            printAllPath(graph, e.dest, dest, path+src);
        }
    }

    public static void main6() {
        int V = 6;
        ArrayList<Edge1> graph[] = new ArrayList[V];
        createGraph8(graph);

        int src = 5, dest = 1;
        printAllPath(graph, src, dest, "");
    }

    public static void createGraph9(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));


    }
    static class Pair implements Comparable<Pair>  {
        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length]; /* dist[i] -> src to i */
        for(int i=0; i<graph.length; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE; /* infinity */
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        /* loop */
        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.n]) {
                vis[curr.n] = true;
                /* neighours */
                for(int i=0; i<graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dist;
                    int wt = e.wt;

                    if(dist[u]+wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v , dist[v]));
                    }
                }
            }
        }

        /* print */
        for(int i=0; i<dist.length; i++) {
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    public static void main7() {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph9(graph);
        int src = 0;
        dijkstra(graph, src);
    }

    static void createGraph10(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length];
        for(int i=0; i<dist.length; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length;
        /* algorithm */
        for(int i=0; i<V-1; i++) {
            /* edges -> O(E) */
            for(int j=0; j<graph.length; j++) {
                for(int k=0; k<graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    /* u, v, wt */
                    int u = e.src;
                    int v = e.dist;
                    int wt = e.wt;
                    /* relaxation */
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }
        /* print */
        for(int i=0; i<dist.length; i++) {
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    public static void main8() {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph10(graph);
        bellmanFord(graph, 0);
    }
    
    static void createGraph11(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair1 implements Comparable<Pair1> {
        int v;
        int cost;

        public Pair1(int v, int c) {
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair1 p2) {
            return this.cost - p2.cost;
        }
    }

    public static void prims(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair1> pq = new PriorityQueue<>();
        pq.add(new Pair1(0, 0));
        int finalCost = 0; /* MST cost */

        while(!pq.isEmpty()) {
            Pair1 curr = pq.remove();
            if(!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost += curr.cost;

                for(int i=0; i<graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair1(e.dist, e.wt));

                }
            }
        }
        System.out.println("Final(Min) cost of MST : : "+finalCost);
    }

    public static void main9() {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph11(graph);
        prims(graph);
    }

    static void createGraph12(int flights[][], ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    static class Info {
        int v;
        int cost;
        int stops;

        public Info(int v, int c, int s) {
            this.v = v;
            this.cost = c;
            this.stops = s;

        }
    }

    public static int cheapestFlight(int n, int flights[][], int src, int dest, int k) {
       
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph12(flights, graph);

        int dist[] = new int[n];
        for(int i=0; i<n; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0)) ;

        while(!q.isEmpty()) {
            Info curr = q.remove();

            if(curr.stops > k) {
                break;
            }

            for(int i=0; i<graph[curr.v].size(); i++) {
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dist;
                int wt = e.wt;

                if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v] && curr.stops <= k) {
                    dist[v] = dist[u]+wt;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }

            }
        }

        /* dist[dest] */
        if(dist[dest] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }
    }

    public static void main10() {
        int n = 4;
        int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0, dest = 3, k = 1;
        System.out.println(cheapestFlight(n, flights, src, dest, k));

        

    }

    static class Edge2 implements Comparable<Edge2> {
        int dest;
        int cost;

        public Edge2(int d, int c) {
            this.dest = d;
            this.cost = c;

        }

        @Override 
        public int compareTo(Edge2 e2) {
            return this.cost - e2.cost;

        }
    }
    
    public static int connectCitites(int cities[][]) {
        PriorityQueue<Edge2> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[cities.length];

        pq.add(new Edge2(0, 0));
        int finalCost = 0;

        while(!pq.isEmpty()) {
            Edge2 curr = pq.remove();
            if(!vis[curr.dest]) {
                vis[curr.dest] = true;
                finalCost += curr.cost;

                for(int i=0; i<cities[curr.dest].length; i++) {
                    if(cities[curr.dest][i] != 0) {
                        pq.add(new Edge2(i, cities[curr.dest][i]));
                    }
                }
            }
        }


        return finalCost;
    }

    public static void main11() {
        int cities[][] = {{0, 1, 2, 3, 4},
                           {1, 0, 5, 0, 7},
                          {2, 5, 0, 6, 0},
                        {3, 0, 6, 0, 0},
                    {4, 7, 0, 0, 0} };

    System.out.println(connectCitites(cities));

    }

   
 
    public static void main12() {

    }
    public static void main(String args[]) { 

        main11();

    }
}