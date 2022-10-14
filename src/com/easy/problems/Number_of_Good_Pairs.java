// https://leetcode.com/problems/number-of-good-pairs/

/*
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

package com.easy.problems;
import java.util.*;

public class Number_of_Good_Pairs {
	public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        
        for(int x: nums)
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        
         double sum = 0;
        
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue() > 1){
                sum = sum + (0.5 + (entry.getValue() - 2)*0.5)*entry.getValue();
            }
        }
        
        return (int)sum;
    }
}
