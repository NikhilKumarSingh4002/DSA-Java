public class bellman {
    int V,E;
    class Edge{
        int src,dest,weight;
        Edge(){src = dest = weight = 0;}
    }
    Edge edge[];
    bellman(int V,int E){
        this.V = V;
        this.E = E;
        edge = new Edge[E];
        for(int i = 0;i<E;i++){
            edge[i] = new Edge();
        } 
    }
    void belman(int source){ 
        int[] distance = new int[V];
        for(int i = 0;i<V;i++){
            distance[i] = Integer.MAX_VALUE;
        }
        distance[source] = 0;
        for(int i = 1;i<V;i++){
            for(int j = 0;j<E;j++){
                int u = this.edge[j].src;
                int v = this.edge[j].dest;
                int w = this.edge[j].weight;
                if(distance[u] != Integer.MAX_VALUE && distance[u]+w < distance[v]){
                    distance[v] = distance[u]+w;
                }
            }
        }
        for(int j = 0;j<E;j++){
            int u = this.edge[j].src;
            int v = this.edge[j].dest;
            int w = this.edge[j].weight;
            if(distance[u] != Integer.MAX_VALUE && distance[u]+w < distance[v]){
                System.out.println("Graph contains negative weight cycle");
                return;
            }
        }
        for(int i = 0;i<V;i++){
            System.out.println(i +" -- "+ distance[i]);
        }
    }
    public static void main(String[] args) {
        int V = 5;
        int E = 6;
        bellman g = new bellman(V,E);
        g.edge[0].src = 0;
        g.edge[0].dest = 1;
        g.edge[0].weight = 1;
        g.edge[1].src = 0;
        g.edge[1].dest = 2;
        g.edge[1].weight = 2;
        g.edge[2].src = 2;
        g.edge[2].dest = 1;
        g.edge[2].weight = -2;
        g.edge[3].src = 2;
        g.edge[3].dest = 3;
        g.edge[3].weight = 1;
        g.edge[4].src = 2;
        g.edge[4].dest = 4;
        g.edge[4].weight = 2;
        g.edge[5].src = 3;
        g.edge[5].dest = 4;
        g.edge[5].weight = 5;
        g.belman(0);
    }
}
