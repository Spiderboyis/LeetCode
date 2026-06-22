package Step_June.Hackathon.Recursion;
import java.util.*;
public class Enumerate {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        System.out.println(permutation(n,k));
        System.out.println(combination(n,k));
        System.out.println(subset(n));
    }

    public static int permutation(int n, int k){
        if(n == 0 || k ==0 || k == n){
            return 1;
        }
        return n * permutation(n-1,k-1);
    }

    public static int combination(int n, int k){
        if(n == 0 || k ==0 || k == n){
            return 1;
        }
        return combination(n-1,k) + combination(n-1,k-1);
    }

    public static int subset(int n){
        if(n == 0){
            return 1;
        }
        return 2 * subset(n-1);
    }
}
