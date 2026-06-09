package Arrays;

import java.util.*;

public class Practice{
    public static void main(String[] args){
        int[] arr = {1,1,1,1,2,3,5};
        System.out.println(findMajority(arr));
    }

    public static int findMajority(int[] arr){
        int count = 0;
        int candidate = -1;
        for(int i = 0; i < arr.length; i++){
            if(count == 0) {
                candidate = arr[i];
                count = 1;
            } else{
                if(arr[i] == candidate){
                    count++;
                } else{
                    count--;
                }
            }
        }
        count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == candidate){
                count++;
            }
            if(count > arr.length/2){
                return candidate;
            }
        }
        return -1;
    }

}