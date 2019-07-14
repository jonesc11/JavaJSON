package com.collindjones.javajson;

import java.util.HashMap;
import java.util.Map;

/**
 * This represents an object in JSON.
 * 
 * @author jonesc11
 */
public class JSONobject extends JSON {
	private Map<String, JSON> mRep;
	
	/**
	 * @param parent is this object's parent
	 * @require none
	 * @modify none
	 * @effect creates a new JSONobject object
	 */
	public JSONobject(JSON parent) {
		super(parent);
		this.mRep = new HashMap<String, JSON>();
	}
	
	/**
	 * @require none
	 * @modify none
	 * @effect none
	 * @return a copy of this.mRep
	 */
	public HashMap<String, JSON> getMap() {
		return new HashMap<String, JSON>(this.mRep);
	}
	
	/**
	 * @param key is the key associated with the value
	 * @param value is the value to store
	 * @require none
	 * @modify this
	 * @effect puts the key-value pair in this.mRep
	 */
	public void put(String key, JSON value) {
		this.mRep.put(key, value);
	}
	
	@Override
	public String toString() {
		//- TODO: implement
		return null;
	}
}
