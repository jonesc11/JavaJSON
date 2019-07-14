package com.collindjones.javajson;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class JSONarrayTest {
	JSONarray ja;
	
	@Before
	public void setUp() {
		ja = new JSONarray();
		
		ja.append(new JSONdouble(88.2));
		ja.append(new JSONstring("hello narnia"));
		ja.append(new JSONint(331));
	}
	
	@Test
	public void testValue() {
		ArrayList<JSON> lst = ja.getArray();
		
		assertEquals(3, lst.size());
		
		assertFalse(lst.get(0) == null);
		assertFalse(lst.get(1) == null);
		assertFalse(lst.get(2) == null);
		
		assertTrue(lst.get(0) instanceof JSONdouble);
		assertTrue(lst.get(1) instanceof JSONstring);
		assertTrue(lst.get(2) instanceof JSONint);
		
		assertEquals(88.2, ((JSONdouble) lst.get(0)).getDouble(), 0.00001);
		assertEquals("hello narnia", ((JSONstring) lst.get(1)).getString());
		assertEquals(331, ((JSONint) lst.get(2)).getInt());
	}
	
	@Test
	public void testString() {
		String expected = "[88.2,\"hello narnia\",331]";
		assertEquals(expected, ja.toString());
	}
}
