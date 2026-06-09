package Step_June.Hackathon.StackAndQueue;
import java.util.Scanner;

public class DemandSpikeMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        getSlidingWindowMin(n,k,arr);
    }

    public static void getSlidingWindowMin(int n, int k, int[]arr){
        if(arr == null || n == 0 || k == 0){
            return;
        }
        int[] deque = new int[n];
        int front = 0;
        int back = 0;
        for(int i = 0; i < n; i++){
            if(front < back && deque[front] <= i - k){
                front++;
            }
            while(front < back && arr[deque[back-1]] <= arr[i]){
                back--;
            }
            deque[back] = i;
            back++;

            if(i >= k-1){
                System.out.print(arr[deque[front]] + " ");
            }
        }
        System.out.println();
    }
}
