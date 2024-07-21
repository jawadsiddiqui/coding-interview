package org.example;

import java.util.Arrays;

public class ThreeSum {


    public static int[] threeSum(int[] nums, int target){
        int[] result = new int[]{};
        Arrays.sort(nums);

        int triplets , low, high;

        for (int i = 0; i < nums.length - 2; i++) {

            low = i+1;
            high = nums.length-1;


            while (low<high){
                triplets = nums[i]+nums[low]+nums[high];
                System.out.println("triplets:"+triplets);
                if(triplets==target){
                    return result = new int[]{nums[i],nums[low],nums[high]};
                } else if (triplets< target) {
                    low++;

                } else {
                    high--;
                }

            }


        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,3,2,3,4};
        int target = 8;

        Arrays.stream(threeSum(nums, target)).forEach(System.out::println);
    }
}
