package org.crackcode.ch1;
import static org.junit.Assert.*;

import org.crackcode.ch1.Practice4;
import org.junit.Test;


public class Practice4Test {

	@Test
	public void testIsAnagram() {
		assertTrue(Practice4.isAnagram("abcde", "bdeca"));
		assertFalse(Practice4.isAnagram("abcde", "bdecav"));
	}

}
