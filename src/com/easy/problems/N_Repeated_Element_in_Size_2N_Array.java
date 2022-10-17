// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

/*
	You are given an integer array nums with the following properties:
	
	nums.length == 2 * n.
	nums contains n + 1 unique elements.
	Exactly one element of nums is repeated n times.
	Return the element that is repeated n times.
	
	Example 1:
	
	Input: nums = [1,2,3,3]
	Output: 3
	Example 2:
	
	Input: nums = [2,1,2,5,3,2]
	Output: 2
	Example 3:
	
	Input: nums = [5,1,5,2,5,3,5,4]
	Output: 5
	 
	Constraints:
	
	2 <= n <= 5000
	nums.length == 2 * n
	0 <= nums[i] <= 104
	nums contains n + 1 unique elements and one of them is repeated exactly n times.
*/

package com.easy.problems;
import java.util.*;

public class N_Repeated_Element_in_Size_2N_Array {
	public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int x: nums){
            hm.put(x, hm.getOrDefault(x, 0)+1);
            if((int)hm.get(x) == nums.length/2){
                return x;
            }
        }
        
        return -1;
    }
}
