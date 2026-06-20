package Step_June.Hackathon.Graphs;
import java.util.*;

public class ShortestHops {
    public static void main(String[] args){

    }
    public static void findShortestHops(int N, int[][] edges, int S){
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < N; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for(int i = 0; i < N; i++){
            Collections.sort(adj.get(i));
        }
        int[] distance = new int[N];
        Arrays.fill(distance,-1);
        boolean[] isVisited = new boolean[N];
        List<Integer> bfs = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(S);
        isVisited[S] = true;
        distance[S] = 0;
        while(!queue.isEmpty()){
            int c = queue.poll();
            bfs.add(c);
            for(int neighbor : adj.get(c)){
                if(!isVisited[neighbor]){
                    isVisited[neighbor] = true;
                    distance[neighbor] = distance[c] + 1;
                    queue.add(neighbor);
                }
            }
        }
        int count = 0;
        int farthestDistance = 0;
        for(int i = 0; i < N; i++){
            if(distance[i] != -1){
                count++;
                if(distance[i] > farthestDistance){
                    farthestDistance = distance[i];
                }
            }
        }
    }
}
