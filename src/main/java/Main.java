import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Vertex[] vertex = new Vertex[5];

        vertex[0] = new Vertex("A",Color.RED);
        vertex[1] = new Vertex("B",Color.CYAN);
        vertex[2] = new Vertex("C",Color.YELLOW);
        vertex[3] = new Vertex("D",Color.BLUE);
        vertex[4] = new Vertex("E",Color.green);

        vertex[0].add_neighbor(vertex[1]);
        vertex[1].add_neighbor(vertex[4]);
        vertex[0].add_neighbor(vertex[2]);
        vertex[2].add_neighbor(vertex[3]);

        new DFS(vertex[0]);

    }
}


