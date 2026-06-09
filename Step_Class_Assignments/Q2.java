package Step_Class_Assignments;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        endsWithNine(10000);
    }
    public static boolean isPrime(int n){
        if(n == 1){
            return true;
        }
        if(n == 2){
            return false;
        }
        for(int i = 3; i <= Math.sqrt(n); i+=2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void endsWithNine(int limit){
        int totalCount = 0;
        for(int start = 0; start < limit; start+=100){
            int end = start+99;
            List<Integer> totalPrime = new ArrayList<>();
            for(int i = start; i <= end; i++){
                if(i%10 == 9 && isPrime(i)){
                    totalPrime.add(i);
                }
            }
            int range = totalPrime.size();
            totalCount += range;
        }
        System.out.println(totalCount);
    }
}
