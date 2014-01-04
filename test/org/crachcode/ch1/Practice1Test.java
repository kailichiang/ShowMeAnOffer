package org.crachcode.ch1;

import static org.junit.Assert.*;

import org.crackcode.ch1.Practice1;
import org.junit.Test;

public class Practice1Test {

	@Test
	public void testIsUniq() {
		Practice1 p1 = new Practice1();
		assertTrue(p1.isUniq("abcde"));
		assertFalse(p1.isUniq("abbcde"));
	}

}
