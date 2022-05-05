public class DFS {
    public DFS(Vertex root){
        root.setVisited(true);
        System.out.println(root.getName());
        for (Vertex v:root.getNeighbor()) {
            if (!v.isVisited()){
                new DFS(v);
            }
        }
    }
}
