package Step_June;
import java.util.*;
public class June_16 {
    public static ArrayList<ArrayList<Integer>> graph(int V, int[][] edges){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for(int i = 0; i < V; i++){
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(V,0));
            matrix.add(row);
        }
        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];
        }
        return matrix;
    }

    public static void findLandWater(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean[][] isVisited = new boolean[rows][columns];
        List<Integer> land = new ArrayList<>();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(matrix[i][j] == 1 && !isVisited[i][j]){
                    int size = dfs(matrix,i,j,isVisited,1);
                    land.add(size);
                }
            }
        }
        isVisited = new boolean[rows][columns];
        List<Integer> water = new ArrayList<>();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(matrix[i][j] == 0 && !isVisited[i][j]){
                    int size = dfs(matrix,i,j,isVisited,0);
                    water.add(size);
                }
            }
        }
        System.out.println("Total Land Possible: " + land);
        System.out.println("Total Water: " + water);
    }
    private static int dfs(int[][] matrix, int i, int j, boolean[][] isVisited, int target){
        int rows = matrix.length;
        int columns = matrix[0].length;
        if(i < 0 || j < 0 || i >= rows || j >= columns){
            return 0;
        }
        if(isVisited[i][j] || matrix[i][j] != target){
            return 0;
        }
        isVisited[i][j] = true;
        int size = 1;
        int[] rowsOffset = {-1,1,0,0};
        int[] columnsOffset = {0,0,-1,1};
        for(int k = 0; k < 4; k++){
            size += dfs(matrix, i + rowsOffset[k], j + columnsOffset[k], isVisited,target);
        }
        return size;
    }



    public static void main(String[] args) {
//        int[][] matrix = {
//                {1,1,0,0},
//                {1,0,0,1},
//                {0,1,1,1},
//                {1,0,0,1}
//        };
//        findLandWater(matrix);

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < N; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int S = sc.nextInt();
        sc.close();
        for(int i = 0; i < N; i++){
            Collections.sort(adj.get(i));
        }
        boolean[] isVisited = new boolean[N];
        int[] distance = new int[N];
        for(int i = 0; i < N; i++){
            distance[i] = -1;
        }
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        isVisited[S] = true;
        distance[S] = 0;
        queue.add(S);

        while(!queue.isEmpty()){
            int curr = queue.poll();
            bfs.add(curr);
            for(int neighbor : adj.get(curr)){
                if(!isVisited[neighbor]){
                    isVisited[neighbor] = true;
                    distance[neighbor] = distance[curr] + 1;
                    queue.add(neighbor);
                }
            }
        }
    }
}
