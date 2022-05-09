import java.util.LinkedList;

public class Dijkstra {
    public Dijkstra(Vertex[] graph, Vertex root,Vertex target){
        LinkedList<Vertex> queue = new LinkedList<>();
        int[] dist = new int[graph.length];
        Vertex[] prev = new Vertex[graph.length];
        for (int i=0;i< graph.length;i++){
            queue.add(graph[i]);
            dist[i] = Integer.MAX_VALUE;
            prev[i] = null;
        }

        dist[root.getIndex()] = 0;
        prev[root.getIndex()] = root;
        while(!queue.isEmpty()){
            Vertex u = min_distance(queue,dist);
            queue.remove(u);
            System.out.println("From "+prev[u.getIndex()].getName() + " -> " + u.getDistance() +" -> to "+u.getName());
            if(target == u){
                System.out.println("From "+root.getName()+" -> "+dist[u.getIndex()]+" -> to "+target.getName());
                return;
            }
            for (Vertex v:u.getNeighbor()) {
                if(queue.contains(v)){
                    int alt = dist[u.getIndex()]+v.getDistance();
                    if(alt<dist[v.getIndex()]){
                        dist[v.getIndex()] = alt;
                        prev[v.getIndex()] = u;
                    }
                }
            }
        }

    }
    private Vertex min_distance(LinkedList<Vertex> queue, int[] dist){
        int min = Integer.MAX_VALUE;
        Vertex u = null;
        for (Vertex v:queue) {
            if(dist[v.getIndex()]<min){
                min = dist[v.getIndex()];
                u = v;
            }
        }
        return u;
    }
}
