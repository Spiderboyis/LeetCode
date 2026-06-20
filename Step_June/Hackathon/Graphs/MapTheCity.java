package Step_June.Hackathon.Graphs;
import java.util.Scanner;
import java.util.ArrayList;
public class MapTheCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i = 0; i < N; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int maxDegree = 0;
        int count = 0;
        for(int i = 0; i < N; i++){
            int degree = adj.get(i).size();
            if(degree > maxDegree){
                maxDegree = degree;
            }
            if(degree == 0){
                count++;
            }
        }
    }
}
