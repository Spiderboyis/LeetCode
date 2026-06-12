package Step_June;

import java.util.Scanner;

public class June_3 {
    public static void main(String[] args) {
//        String str = "abababc";
//        String target = "ababc";
//
//        System.out.println(findSubString(str,target));
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

//        long[] a = new long[n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextLong();
//        }
//        System.out.println("Max Subarray Sum: " + maxSubarraySum(a));
//        System.out.println("Equilibrium Index: " + equilibriumIndex(a));
//
//        long[] values = new long[n + 1];
//        int[] xorLinks = new int[n + 1];
//        for(int i = 1; i <= n; i++){
//            values[i] = sc.nextLong();
//        }
//
//        for(int i = 1; i <= n; i++){
//            int prevIndex = i - 1;
//            int nextIndex = 0;
//            if(i < n){
//                nextIndex = i + 1;
//            }
//            xorLinks[i] = prevIndex ^ nextIndex;
//        }
//
//        //Forward Printing
//        System.out.println("Forward");
//        int prev = 0;
//        int current = 1;
//        while(current != 0){
//            System.out.print(values[current]);
//            int nextNode = xorLinks[current] ^ prev;
//            if(nextNode != 0){
//                System.out.print(" ");
//            }
//            prev = current;
//            current = nextNode;
//        }
//        System.out.println();
//
//        //Backwards Printing
//        System.out.println("Backwards");
//        int nextNode = 0;
//        current = n;
//        while(current != 0){
//            System.out.print(values[current]);
//            int prevNode = xorLinks[current] ^ nextNode;
//            if(prevNode != 0){
//                System.out.print(" ");
//            }
//            nextNode = current;
//            current = prevNode;
//        }
//        System.out.println();
//
//        System.out.println("XOR Links");
//        for(int i = 1; i <= n; i++){
//            System.out.print(xorLinks[i]);
//            if(i < n){
//                System.out.print(" ");
//            }
//        }
//        System.out.println();
//        sc.close();
    }


    // This function contains a BUG. Find it and fix it.
//    static long maxSubarraySum(long[] a) {
//        long best = a[0];
//        long cur = a[0];
//        for (int i = 1; i < a.length; i++) {
//            cur = cur + a[i];
//            best = Math.max(best, cur);
//        }
//        return best;
//    }

// TODO: Implement this function from scratch.
// Return the first index where the sum to its left equals the sum to its
// right (excluding the index), or -1.

//    static int equilibriumIndex(long[] a) {
//        long totalSum = 0;
//        for (long val : a) {
//            totalSum += val;
//        }
//        long leftSum = 0;
//        for (int i = 0; i < a.length; i++) {
//            long rightSum = totalSum - leftSum - a[i];
//            if (leftSum == rightSum) {
//                return i;
//            }
//            leftSum += a[i];
//        }
//        return -1;

    // Method-2

//        int first = 0;
//        int last = a.length - 1;
//        int mid = first + (last - first) / 2;
//        long firstSum = 0;
//        long lastSum = 0;
//        while(first < mid){
//            for(int i = 0; i < mid; i++){
//                firstSum += a[i];
//                first++;
//            }
//        }
//        while(last > mid){
//            for(int i = a.length - 1; i > mid; i--){
//                lastSum += a[i];
//                last--;
//            }
//        }
//        if(firstSum == lastSum){
//            return mid;
//        }
//        else{
//            if(firstSum > lastSum){
//                return mid - 1;
//            }
//            else{
//                return mid + 1;
//            }
//        }
//    }

//    public static boolean findSubString(String s, String target){
//        for(int i = 0; i < s.length(); i++){
//            for(int j = 0; j < target.length(); j++){
//                if(s.charAt(i) == target.charAt(j)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

}

