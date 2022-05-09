public class Main {
    public static void main(String[] args) {

        Vertex[] vertex = new Vertex[5];

        vertex[0] = new Vertex("A",0,0);
        vertex[1] = new Vertex("B",5,1);
        vertex[2] = new Vertex("C",6,2);
        vertex[3] = new Vertex("D",2,3);
        vertex[4] = new Vertex("E",3,4);

        vertex[0].add_neighbor(vertex[1]);
        vertex[0].add_neighbor(vertex[2]);
        vertex[1].add_neighbor(vertex[2]);
        vertex[1].add_neighbor(vertex[4]);
        vertex[2].add_neighbor(vertex[3]);
        vertex[3].add_neighbor(vertex[1]);
        vertex[4].add_neighbor(vertex[2]);

//        new BFS(vertex[0]);
//        new DFS(vertex[0]);
//        new Dijkstra(vertex, vertex[0],vertex[3]);

    }
}


