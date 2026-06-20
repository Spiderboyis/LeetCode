package Step_June;
import java.util.*;
public class June_18 {
    static class Disjoint{
        private int[] parent;
        private int[] rank;
        private int count;
        public Disjoint(int n){
            parent = new int[n];
            rank = new int[n];
            count = n;
            for(int i = 0; i < n; i++){
                parent[i] = i;
                rank[i] = 0;
            }
        }
        public int find(int n){
            if(parent[n] == n){
                return n;
            }
            return parent[n] = find(parent[n]);
        }
        public void union(int i,int j){
            int root1 = find(i);
            int root2 = find(j);
            if(rank[root1] != rank[root2]){
                if(rank[root1] > rank[root2]){
                    parent[root1] = root2;
                }else if(rank[root2] > rank[root1]){
                    parent[root2] = root1;
                }else{
                    parent[root1] = root2;
                    rank[root1]++;
                }
                count--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edges = sc.nextInt();
        int totalWeight = 0;
        int minEdge = Integer.MAX_VALUE;
        int maxEdge = Integer.MIN_VALUE;
        for(int i = 0; i < edges; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            totalWeight += weight;
            if(minEdge > weight){
                minEdge = weight;
            }
            if(maxEdge < weight){
                maxEdge = weight;
            }
        }
    }
}
