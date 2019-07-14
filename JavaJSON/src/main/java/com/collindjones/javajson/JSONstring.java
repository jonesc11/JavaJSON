package com.collindjones.javajson;

/**
 * This object represents a string in JSON.
 * 
 * @author jonesc11
 */
public class JSONstring extends JSON {
	private String mRep;
	
	/**
	 * @param parent is this object's parent
	 * @param str is the string this object represents
	 * @require none
	 * @modify none
	 * @effect none
	 */
	public JSONstring(String str) {
		this.mRep = str;
	}
	
	/**
	 * @require none
	 * @modify none
	 * @effect none
	 * @return this.mRep
	 */
	public String getString() {
		return this.mRep;
	}
	
	@Override
	public String toString() {
		return "\"" + this.mRep + "\"";
	}
}
