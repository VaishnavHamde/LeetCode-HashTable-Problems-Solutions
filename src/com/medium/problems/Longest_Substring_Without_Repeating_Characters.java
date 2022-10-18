// https://leetcode.com/problems/longest-substring-without-repeating-characters/

/*
	Given a string s, find the length of the longest substring without repeating characters.

	Example 1:
	
	Input: s = "abcabcbb"
	Output: 3
	Explanation: The answer is "abc", with the length of 3.
	Example 2:
	
	Input: s = "bbbbb"
	Output: 1
	Explanation: The answer is "b", with the length of 1.
	Example 3:
	
	Input: s = "pwwkew"
	Output: 3
	Explanation: The answer is "wke", with the length of 3.
	Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
	
	Constraints:
	
	0 <= s.length <= 5 * 104
	s consists of English letters, digits, symbols and spaces.
*/

package com.medium.problems;
import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {
	public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        
        if(s.length() == 1)
            return 1;
        
        if(s.length() == 0)
            return 0;
        
        int f = 0;
        int res = 0;
        
        for(int i = 0; i < s.length(); i++){
            while(hs.contains(s.charAt(i))){
                
                hs.remove(s.charAt(f));
                f++;
            }
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
                res = Math.max(res, i-f);
            }
        }
        
        return res+1;
    }
}
