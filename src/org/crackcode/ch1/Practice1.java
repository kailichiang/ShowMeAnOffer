package org.crackcode.ch1;

import java.util.HashSet;
import java.util.Set;

/* *
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures? 
 * 
 * */
public class Practice1 {
	public static boolean isUniq(String str) {
		// Set implementation: HashSet, TreeSet, and LinkedHashSet
		Set<Character> strSet = new HashSet<Character>();
		int length = str.length();
		for( int i=0; i<length; i++) {
			Character ch = str.charAt(i);
			// if ch already exists in the strSet, it returns false
			if( !strSet.add(ch) ) {
				return false;
			}
		}
		return true;
	}
}
