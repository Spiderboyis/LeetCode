package Step_June;
import java.util.*;
public class June_17 {
    static class State{
        int steps;
        int value;
        State(int steps,int value){
            this.value = value;
            this.steps = steps;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        Queue<State> queue = new LinkedList<>();
        boolean[] visited = new boolean[limit+1];
        queue.add(new State(s,0));
        visited[s] = true;
        int finalSteps = -1;
        boolean reachable = false;
        while(!queue.isEmpty()){
            State current = queue.poll();
            int[] nextMoves = {current.value + 1, current.value - 1, current.value * 2};
            for(int nextVal : nextMoves){
                if(nextVal >= 0 && nextVal <= limit && !visited[nextVal]){
                    if(nextVal == t){
                        finalSteps = current.steps + 1;
                        reachable = true;
                        break;
                    }
                    visited[nextVal] = true;
                    queue.add(new State(nextVal,current.steps+1));
                }
            }
            if(reachable){
                break;
            }
        }
    }
}
