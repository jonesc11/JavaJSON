package com.collindjones.javajson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JSONintTest {
	@Test
	public void testValue() {
		JSONint ji = new JSONint(41);
		assertEquals(41, ji.getInt());
	}
	
	@Test
	public void testOutput() {
		JSONint ji = new JSONint(889);
		assertEquals("889", ji.toString());
	}
}
