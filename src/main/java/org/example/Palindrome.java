package org.example;

import java.util.*;

public class Palindrome {


    //main entry point for JVM, it looks for starting project
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,5,6,3};
        int target = 2;

        TwoSum(nums, target);
    }

    private static int[]  TwoSum(int[] nums, int target) {

        Map<Integer, Integer> map  = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int complement = target - nums[i];
            System.out.println(complement);
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

        }
        return new int[]{};
    }

}
