package Step_June;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class June_2 {
    public static void main(String[] args) {
        // int[] nums = {21,4,7, 21};
        // System.out.println(sumFourDivisors(nums));
        // System.out.println(isPrime(17));
        //  System.out.println(gcd(123456,7891011));
        // System.out.println(lcm(123456,7891011));
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long d = scanner.nextLong();
        long k = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();

        long sum = n*(n+1)/2;
        long sumSquares = n*(n+1)*(2*n+1)/6;
        long arithmeticSum = k * (2 * a + (k - 1) * d) / 2;
        long discriminant = B*B - 4*A*C;
        if(discriminant < 0){
            System.out.println("Complex roots");
        }

    }

    // public static int fact(int n){
    //     int fact = 1;
    //     for(int i = 1; i <= n; i++){
    //         fact *= i;
    //     }
    //     return fact;
    // }

    // public static long getNcr(int n, int r){
    //     if(r < 0 || r > n){
    //         return 0;
    //     }
    //     if(r == 0; || r == n){
    //         return 1;
    //     }

    //     long result = 1;
    //     for(int i = 0; i <= r; i++){
    //         result = result *(n-r+i)/i;
    //     }
    //     return result;
    // }

    // public static String getPascalRow(int n){
    //     StringBuilder str = new StringBuilder();
    //     long currentTerm = 1;
    //     str.append(currentTerm);
    //     for(int i = 0; i < n; i++){
    //         currentTerm = currentTerm*(n - i)/(i + 1);
    //         str.append(" ").append(currentTerm);
    //     }
    //     return str.toString();
    // }

    // public static long getPower(int base, int exp, int mod){
    //     if(mod == 1){
    //         return 0;
    //     }
    //     long result = 1;
    //     base %= mod;

    //     while(exp > 0){
    //         if((exp & 1) == 1){
    //             result = (result * base) % mod;
    //         }
    //         base = (base * base) % mod;
    //         exp >>= 1;
    //     }
    //     return result;
    // }

    // public static int countPrimesUpTo(int a) {
    //     if (a < 2){
    //         return 0;
    //     }
    //     boolean[] isPrime = new boolean[a + 1];
    //     Arrays.fill(isPrime, true);
    //     isPrime[0] = false;
    //     isPrime[1] = false;
    //     for (int i = 2; i * i <= a; i++) {
    //         if (isPrime[i]) {
    //             for (int j = i * i; j <= a; j += i) {
    //                 isPrime[j] = false;
    //             }
    //         }
    //     }
    //     int count = 0;
    //     for (int i = 2; i <= a; i++) {
    //         if (isPrime[i]) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // public static long gcd(long a, long b){
    //     while(b != 0){
    //         long temp = b;
    //         b = a % b;
    //         a = temp;
    //     }
    //     return a;
    // }

    // public static long lcm(long a, long b){
    //     return a / gcd(a,b) * b;
    // }

    // public static boolean isPrime(int n){
    //     if(n <= 1){
    //         return false;
    //     }
    //     if(n == 2){
    //         return true;
    //     }
    //     for(int i = 2; i*i <= n; i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    // public static int sumFourDivisors(int[] nums) {
    //     int totalSum = 0;
    //     for (int num : nums) {
    //         int count = 0;
    //         int currentSum = 0;
    //         for (int i = 1; i * i <= num; i++) {
    //             if (num % i == 0) {
    //                 count++;
    //                 currentSum += i;
    //                 if (i * i != num) {
    //                     count++;
    //                     currentSum += num / i;
    //                 }
    //             }
    //             if (count > 4) {
    //                 break;
    //             }
    //         }
    //         if (count == 4) {
    //             totalSum += currentSum;
    //         }
    //     }

    //     return totalSum;
    // }
}