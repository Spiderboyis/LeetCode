package Step_June.Hackathon.Graphs;
import java.util.*;
public class FindTheDistricts {
    private static boolean[] visited;
    private static List<Integer> dfs;
    private static int componentSize = 0;

    private static void dfs(int u, List<List<Integer>> matrix){
        visited[u] = true;
        dfs.add(u);
        componentSize++;
        for(int v : matrix.get(u)){
            if(!visited[v]){
                dfs(v,matrix);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 7;
        int[][] edges = {
                {0,1},
                {0,2},
                {2,3},
                {4,5}
        };
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < vertices; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for(int i = 0; i < vertices; i++){
            Collections.sort(graph.get(i));
        }
        visited = new boolean[vertices];
        int componentCount = 0;
        int maxSize = 0;
        for(int i = 0; i < vertices; i++){
            if(!visited[i]){
                    componentCount++;
                    componentSize = 0;
                    dfs(i,graph);
                    if(componentSize > maxSize){
                        maxSize = componentSize;
                    }
            }
        }
    }
}
