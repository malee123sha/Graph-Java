public class Graph {
    class Edge {
        int node,dest;
    }
    int vertices,edges;
    Edge [] edge;
    Graph (int vertices, int edges) {
        this.vertices = vertices;
        this.edges =edges;
        edge = new Edge [edges];
        for (int i = 0;i < edges;i++){
            edge [i]= new Edge();
        }
    }
    public static void main(String[] args) {
        int noVertices = 5;
        int noEdges = 8;
        Graph g = new Graph(noVertices,noEdges);
        g.edge[0].node = 1;
        g.edge[0].dest = 2;
        g.edge[1].node = 1;
        g.edge[1].dest = 3;
        g.edge[2].node = 1;
        g.edge[2].dest = 4;
        g.edge[3].node = 2;
        g.edge[3].dest = 4;
        g.edge[4].node = 2;
        g.edge[4].dest = 5;
        g.edge[5].node = 3;
        g.edge[5].dest = 4;
        g.edge[6].node = 3;
        g.edge[6].dest = 5;
        g.edge[7].node = 4;
        g.edge[7].dest = 5;
        for (int i = 0;i < noEdges;i++){
            System.out.println(g.edge[i].node+".....> "+g.edge[i].dest);
        }
    }
}

