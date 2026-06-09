package Arrays;

public class Q136_SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
    }
    public static int singleNumber(int[] nums) {
        int unique = 0;
        for(int n : nums){
            unique ^= n;
        }
        return unique;
    }
//    public static int singleNumber(int[] nums){
//        for(int i = 0; i < nums.length; i++){
//            boolean seen = false;
//            for(int j = 0; j < nums.length; j++){
//                if(i != j && nums[i] == nums[j]){
//                    seen = true;
//                    break;
//                }
//            }
//            if(!seen){
//                return nums[i];
//            }
//        }
//        return -1;
//    }
}
