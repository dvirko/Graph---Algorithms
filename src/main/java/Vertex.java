import java.util.LinkedList;
import java.util.List;

public class Vertex {
    private final String name;
    private int distance;
    private final List<Vertex> neighbor;
    private boolean visited;
    private final int index;

    public Vertex(String name,int distance,int index) {
        this.name = name;
        this.distance = distance;
        this.index = index;
        this.neighbor = new LinkedList<>();
    }

    public int getIndex() {
        return index;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
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
