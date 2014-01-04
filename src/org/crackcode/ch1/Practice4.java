package org.crackcode.ch1;

import java.util.Arrays;

/**
 * Write a method to decide if two strings are anagrams or not.
 **/
public class Practice4 {
	public static boolean isAnagram(String s, String t) {
		char[] charStrS = s.toCharArray();
		char[] charStrT = t.toCharArray();
        
        Arrays.sort(charStrS);
        Arrays.sort(charStrT);
        String sortedS = new String(charStrS);
        String sortedT = new String(charStrT);
        return sortedS.equals(sortedT);
	}
}
