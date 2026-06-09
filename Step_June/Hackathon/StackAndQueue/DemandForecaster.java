package Step_June.Hackathon.StackAndQueue;
import java.util.*;

public class DemandForecaster {
    public static void main(String[] args){
        int n = 8;
        int[] demand = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = getDays(n,demand);
        System.out.println(Arrays.toString(result));
    }
    public static int[] getDays(int n,int[] demand){
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && demand[i] > demand[stack.peek()]){
                int topIndex = stack.pop();
                ans[topIndex] = i - topIndex;
            }
            stack.push(i);
        }
        return ans;
    }
}
