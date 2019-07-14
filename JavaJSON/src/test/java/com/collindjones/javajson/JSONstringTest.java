package com.collindjones.javajson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JSONstringTest {
	@Test
	public void testValue() {
		JSONstring js = new JSONstring("pickled beets");
		assertEquals("pickled beets", js.getString());
	}
	
	@Test
	public void testString() {
		JSONstring js = new JSONstring("dog bat");
		assertEquals("\"dog bat\"", js.toString());
	}
}
