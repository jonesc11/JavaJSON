package com.collindjones.javajson;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class JSONobjectTest {
	JSONobject jo;
	
	@Before
	public void setUp() {
		jo = new JSONobject();
		
		jo.put("double", new JSONdouble(42.2));
		jo.put("string", new JSONstring("happy walrus"));
		jo.put("int", new JSONint(42));
	}
	
	@Test
	public void testValue() {
		Map<String, JSON> map = jo.getMap();
		
		assertEquals(3, map.size());
		
		assertFalse(map.get("double") == null);
		assertFalse(map.get("string") == null);
		assertFalse(map.get("int") == null);
		
		assertTrue(map.get("double") instanceof JSONdouble);
		assertTrue(map.get("string") instanceof JSONstring);
		assertTrue(map.get("int") instanceof JSONint);
		
		assertEquals(42.2, ((JSONdouble) map.get("double")).getDouble(), .00001);
		assertEquals("happy walrus", ((JSONstring) map.get("string")).getString());
		assertEquals(42, ((JSONint) map.get("int")).getInt());
	}
	
	@Test
	public void testString() {
		List<String> validStrings = new ArrayList<String>();
		
		validStrings.add("{\"double\":42.2,\"string\":\"happy walrus\",\"int\":42}");
		validStrings.add("{\"double\":42.2,\"int\":42,\"string\":\"happy walrus\"}");
		validStrings.add("{\"string\":\"happy walrus\",\"int\":42,\"double\":42.2}");
		validStrings.add("{\"string\":\"happy walrus\",\"double\":42.2,\"int\":42}");
		validStrings.add("{\"int\":42,\"double\":42.2,\"string\":\"happy walrus\"}");
		validStrings.add("{\"int\":42,\"string\":\"happy walrus\",\"double\":42.2}");
		
		assertTrue(validStrings.contains(jo.toString()));
	}
}
