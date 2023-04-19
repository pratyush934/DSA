 import java.util.*;
 public class Union {

    static class Edge3 implements Comparable<Edge3> {
        int src;
        int dest;
        int wt;
        public Edge3(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;


        }
        @Override
        public int compareTo(Edge3 e2) {
            return this.wt - e2.wt;

        }
    }

    static void createGraph13(ArrayList<Edge3> edges) {
        /* edges */
        edges.add(new Edge3(0, 1, 10));
        edges.add(new Edge3(0, 2, 15));
        edges.add(new Edge3(0, 3, 30));
        edges.add(new Edge3(1, 3, 40));
        edges.add(new Edge3(2, 3, 50));
        
    }
    
    static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init() {
        for(int i=0; i<n; i++) {
            par[i] = i;

        }
    }
    public static int find(int x) {
        if(x == par[x]) {
            return x;
        }

        return find(par[x]);
    }
        public static void union(int a, int b) {
            int parA = find(a);
            int parB = find(b);

            if(rank[parA] == rank[parB]) {
                par[parB] = parA;
                rank[parA]++;
            } else if(rank[parA] < rank[parB]) {
                par[parA] = parB;
            } else {
                par[parB] = parA;
            }
        
    
}  

    public static void kruskalsMST(ArrayList<Edge3> edges, int V) {
        init();
        Collections.sort(edges);
        int mstCost = 0;
        int count = 0;

        for(int i=0; count<V-1; i++) {
            Edge3 e = edges.get(i);
            /* (src, dest, wt) */

            int parA = find(e.src);
            int parB = find(e.dest);
            if(parA != parB) {
                union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }
        }
        System.out.println(mstCost);
    }
    public static void main1() {
        int V = 4;
        ArrayList<Edge3> edges = new ArrayList<>();
        createGraph13(edges);
        kruskalsMST(edges, V);

    }
    public static void main(String args[]) {
       
     main1();
 }
}