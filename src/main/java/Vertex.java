import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Vertex {
    private final String name;
    private final List<Vertex> neighbor;
    private final Color color;
    private boolean visited;


    public Vertex(String name, Color color) {
        this.name = name;
        this.neighbor = new LinkedList<>();
        this.color = color;
    }


    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }


    public Color getColor() {
        return color;
    }


    public String getName() {
        return name;
    }

    public List<Vertex> getNeighbor() {
        return neighbor;
    }


    void add_neighbor(Vertex v){
        this.neighbor.add(v);
    }

}
