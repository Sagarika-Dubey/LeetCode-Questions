
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(target - nums[index])) {
                indices[1] = index;
                indices[0] = map.get(target - nums[index]);
                return indices;
            }
            map.put(nums[index], index);
        }
        return indices;
    }
}
