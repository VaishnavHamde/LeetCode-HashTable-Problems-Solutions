// https://leetcode.com/problems/group-anagrams/

/*
	Given an array of strings strs, group the anagrams together. You can return the answer in any order.

	An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
	typically using all the original letters exactly once.
	
	Example 1:
	
	Input: strs = ["eat","tea","tan","ate","nat","bat"]
	Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	Example 2:
	
	Input: strs = [""]
	Output: [[""]]
	Example 3:
	
	Input: strs = ["a"]
	Output: [["a"]]
	
	Constraints:
	
	1 <= strs.length <= 104
	0 <= strs[i].length <= 100
	strs[i] consists of lowercase English letters.
*/

package com.medium.problems;
import java.util.*;

public class Group_Anagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String originalString : strs) {
            String sortedString = sort(originalString);
            if (!map.containsKey(sortedString))
                map.put(sortedString, new ArrayList<>());
            map.get(sortedString).add(originalString);
        }
        
        for (Map.Entry<String, List<String>> it : map.entrySet()) 
            list.add(it.getValue());
        
        return list;
    }
    
    private String sort (String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
