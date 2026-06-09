package Step_June.Hackathon.StackAndQueue;

public class RobotScheduler {
    public static void main(String[] args) {
        int n = 3;
        int q = 3;
        int[] remainingTime = {5,3,8};
        int totalTurn = 0;
        int completionCount = 0;
        while(completionCount < n){
            for(int i = 0; i < n; i++){
                if(remainingTime[i] == 0){
                    continue;
                }
                totalTurn++;
                if(remainingTime[i] <= q){
                    remainingTime[i] = 0;
                    completionCount++;
                    System.out.println((i + 1) + " ");
                }else{
                    remainingTime[i] -= q;
                }
            }
        }
        System.out.println("Total turn: " + totalTurn);
    }
}
