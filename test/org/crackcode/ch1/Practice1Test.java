package org.crackcode.ch1;

import static org.junit.Assert.*;

import org.crackcode.ch1.Practice1;
import org.junit.Test;

public class Practice1Test {

	@Test
	public void testIsUniq() {
		assertTrue(Practice1.isUniq("abcde"));
		assertFalse(Practice1.isUniq("abbcde"));
	}

}
