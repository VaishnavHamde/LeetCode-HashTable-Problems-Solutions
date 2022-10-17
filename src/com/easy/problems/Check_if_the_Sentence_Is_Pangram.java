// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

/*
	A pangram is a sentence where every letter of the English alphabet appears at least once.
	Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
	
	Example 1:
	
	Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
	Output: true
	Explanation: sentence contains at least one of every letter of the English alphabet.
	Example 2:
	
	Input: sentence = "leetcode"
	Output: false
	 
	Constraints:
	
	1 <= sentence.length <= 1000
	sentence consists of lowercase English letters.
*/

package com.easy.problems;
import java.util.*;

public class Check_if_the_Sentence_Is_Pangram {
	public boolean checkIfPangram(String sentence) {
        HashSet<Character> hs = new HashSet<>();
        
        for(int i = 0; i < sentence.length(); i++)
            hs.add(sentence.charAt(i));
        
        if(hs.size() >= 26)
            return true;
        else
            return false;
    }
}
