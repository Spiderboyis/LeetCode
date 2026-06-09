import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Practice{
    public static void main(String[] args){
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums){
        for(int i = 0; i < nums.length; i++){
            boolean seen = false;
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] == nums[j]){
                    seen = true;
                    break;
                }
            }
            if(!seen){
                return nums[i];
            }
        }
        return -1;
    }
}







