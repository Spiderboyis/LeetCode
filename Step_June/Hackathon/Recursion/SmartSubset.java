package Step_June.Hackathon.Recursion;

public class SmartSubset {
    private static int minElements = Integer.MAX_VALUE;
    private static int n;
    private static int[] arr;
    public static void main(String[] args){

    }
    public static void smartSubset(int index, int target,int currentCount){
        if(target == 0){
            if(currentCount < minElements){
                minElements = currentCount;
            }
        }
        if(index >= n || currentCount >= minElements){
            return;
        }
        if(arr[index] > target){
            return;
        }
        smartSubset(index+1, target - arr[index], currentCount + 1);
        smartSubset(index+1, target, currentCount);
    }
}
