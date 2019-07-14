package com.collindjones.javajson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JSONdoubleTest {
	@Test
	public void testValue() {
		JSONdouble jd = new JSONdouble(66.4);
		assertEquals(66.4, jd.getDouble(), .000001);
	}
	
	@Test
	public void testOutput() {
		JSONdouble jd = new JSONdouble(49.2);
		assertEquals("49.2", jd.toString());
	}
}
