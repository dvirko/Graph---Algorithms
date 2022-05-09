import java.util.LinkedList;

public class BFS {
    public BFS(Vertex root){
        LinkedList<Vertex> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);
        while (!queue.isEmpty()){
            root = queue.pop();
            System.out.println(root.getName());
            for (Vertex v:root.getNeighbor()) {
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }

            }
        }

    }
}
