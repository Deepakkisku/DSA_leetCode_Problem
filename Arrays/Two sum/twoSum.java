// ===============================================================================================
// 1. Two Sum
// Easy
// 45.7K
// 1.5K
// Companies
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
 

// Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.
 

// Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
================================================================================================// 



// Using array 
// Time complexity is O(N^2)
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(target == nums[i] + nums[j]){
                    return new int[]{i, j};
                }
            }
        }
        return new int []{};
    }
}


// Using HashMap 
// Time complexity is O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap();

        // Fill the hashMap 
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
           int num = nums[i];
           int rem = target - num;
           if(map.containsKey(rem)){
               int index = map.get(rem);
               if(index == i){
                   continue;
               }
               return new int []{i, index};
           }
        }
        return new int []{};
    }
}