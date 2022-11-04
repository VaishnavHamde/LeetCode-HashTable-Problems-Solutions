// https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/

/*
	You are given an array of strings words. Each element of words consists of two lowercase English letters.
	
	Create the longest possible palindrome by selecting some elements from words and concatenating them in any order. 
	Each element can be selected at most once.
	
	Return the length of the longest palindrome that you can create. If it is impossible to create any palindrome, return 0.
	
	A palindrome is a string that reads the same forward and backward.
	
	
	Example 1:
	
	Input: words = ["lc","cl","gg"]
	Output: 6
	Explanation: One longest palindrome is "lc" + "gg" + "cl" = "lcggcl", of length 6.
	Note that "clgglc" is another longest palindrome that can be created.
	
	Example 2:
	
	Input: words = ["ab","ty","yt","lc","cl","ab"]
	Output: 8
	Explanation: One longest palindrome is "ty" + "lc" + "cl" + "yt" = "tylcclyt", of length 8.
	Note that "lcyttycl" is another longest palindrome that can be created.
	
	Example 3:
	
	Input: words = ["cc","ll","xx"]
	Output: 2
	Explanation: One longest palindrome is "cc", of length 2.
	Note that "ll" is another longest palindrome that can be created, and so is "xx".
	
	Constraints:
	
	1 <= words.length <= 105
	words[i].length == 2
	words[i] consists of lowercase English letters.
*/

package com.medium.problems;
import java.util.*;

public class Longest_Palindrome_by_Concatenating_Two_Letter_Words {
	public int longestPalindrome(String[] words) {
        HashMap<String,Integer> hs = new HashMap<>();
        int count = 0;
        int count2 = 0;
       
        for(int i = 0; i < words.length; i++){
            char[] ch = {words[i].charAt(1), words[i].charAt(0)};
            
            if(words[i].charAt(1) == words[i].charAt(0)){
                if(hs.containsKey(words[i])){
                    count++;
                    count2--;
                    hs.put(words[i],hs.get(words[i]) - 1);
                    
                    if(hs.get(words[i]) == 0)
                        hs.remove(words[i]);
                    continue;
                }
                
                hs.put(words[i], hs.getOrDefault(words[i], 0) + 1);
                count2++;
                continue;
            }
            
            if(hs.containsKey(String.valueOf(ch))){
                count++;
                hs.put(String.valueOf(ch),hs.get(String.valueOf(ch)) - 1);
                
                if(hs.get(String.valueOf(ch)) == 0)
                    hs.remove(String.valueOf(ch));
                continue;
            }
            
            hs.put(words[i], hs.getOrDefault(words[i], 0) + 1);
        }
        if(count2 > 0)
        	count2 = 1;
            
        return (count*2 + count2)*2;
    }
}
