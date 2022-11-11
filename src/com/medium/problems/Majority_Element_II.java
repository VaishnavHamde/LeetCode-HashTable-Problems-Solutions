// https://leetcode.com/problems/majority-element-ii/description/

/*
	Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
	
	 
	
	Example 1:
	
	Input: nums = [3,2,3]
	Output: [3]
	Example 2:
	
	Input: nums = [1]
	Output: [1]
	Example 3:
	
	Input: nums = [1,2]
	Output: [1,2]
	 
	
	Constraints:
	
	1 <= nums.length <= 5 * 104
	-109 <= nums[i] <= 109
*/

package com.medium.problems;
import java.util.*;

public class Majority_Element_II {
	public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
            if(!hs.contains(nums[i]) && hm.containsKey(nums[i]) && (int)hm.get(nums[i]) > Math.ceil(nums.length/3)){
                list.add(nums[i]);
                hs.add(nums[i]);
            }
        }

        return list;
    }
}
