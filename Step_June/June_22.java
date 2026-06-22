package Step_June;
import java.util.*;
public class June_22 {
    public static void main(String[] args) {
        int n = 8;
        int a = 3;
        int b = 6;
        System.out.println(hanoi(n));
        System.out.println(power(a,b));
        System.out.println(gcd(a,b));
    }

    public static int hanoi(int n){
        if(n == 0){
            return 0;
        }
        return 2 * hanoi(n-1) + 1;
    }

    public static int power(int a,int b){
        if(b == 0){
            return 1;
        }
        return a * power(a,b-1);
    }

    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}
