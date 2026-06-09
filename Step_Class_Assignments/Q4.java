package Step_Class_Assignments;

public class Q4 {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 0; i <= 10000; i++){
            if(isSpecialNumber(i)){
                System.out.println(i);
                total++;
            }
        }
        System.out.println(total);
    }
    public static boolean isSpecialNumber(int n){
        String s = Integer.toString(n);
        long sum = 0;
        for(int i = 0; i < s.length(); i++){
            int digit = Character.getNumericValue(s.charAt(i));
            sum += Math.pow(digit,i+1);
        }
        return sum == n;
    }
}
