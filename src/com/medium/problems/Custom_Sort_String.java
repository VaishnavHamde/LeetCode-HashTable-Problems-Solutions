// https://leetcode.com/problems/custom-sort-string/

/*
	You are given two strings order and s. All the characters of order are unique and were sorted in some custom order previously.
	
	Permute the characters of s so that they match the order that order was sorted. More specifically, if a character x occurs before a character y in order, then x should occur before y in the permuted string.
	
	Return any permutation of s that satisfies this property.
	
	 
	
	Example 1:
	
	Input: order = "cba", s = "abcd"
	Output: "cbad"
	Explanation: 
	"a", "b", "c" appear in order, so the order of "a", "b", "c" should be "c", "b", and "a". 
	Since "d" does not appear in order, it can be at any position in the returned string. "dcba", "cdba", "cbda" are also valid outputs.
	Example 2:
	
	Input: order = "cbafg", s = "abcd"
	Output: "cbad"
	 
	
	Constraints:
	
	1 <= order.length <= 26
	1 <= s.length <= 200
	order and s consist of lowercase English letters.
	All the characters of order are unique.
*/

package com.medium.problems;
import java.util.*;

public class Custom_Sort_String {
	public String customSortString(String order, String s) {
        HashMap<Integer, Character> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();

        for(int i = 0; i < order.length(); i++){
            hm1.put(i, order.charAt(i));
            hs.add(order.charAt(i));
        }

        for(int i = 0; i < s.length(); i++)
            hm2.put(s.charAt(i), hm2.getOrDefault(s.charAt(i), 0)+1);

        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < hm1.size(); i++)
            if(hm2.containsKey(hm1.get(i)))
                for(int j = 0; j < (int)hm2.get(hm1.get(i)); j++)
                    res.append((char)hm1.get(i));

        for(int i = 0; i < s.length(); i++)
            if(!hs.contains(s.charAt(i)))
                res.append(s.charAt(i));

        return res.toString();
    }
}
