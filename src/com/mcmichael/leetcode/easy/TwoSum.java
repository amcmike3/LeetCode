package com.mcmichael.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        List< Integer> map = new ArrayList<>();
        int targetCopy = target;
        for (int i = 0; i < nums.length; i++){
            if (map.contains(target - nums[i])) {
                ans[0] = i;
                ans[1] = map.indexOf(target - nums[i]);
            } else {
                map.add(nums[i]);
            }
        }
        return ans;
    }
    /*
     * a map works well in this scenario because it has the indexOf and the contains methods.
     * iterate over the given array and if the map contains two values that add up to the target value
     * return the index of those values.
     * otherwise add the current element in question to the map.
     */
    
}

