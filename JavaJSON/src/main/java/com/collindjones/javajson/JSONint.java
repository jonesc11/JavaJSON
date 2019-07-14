package com.collindjones.javajson;

/**
 * This object represents an integer found in a JSON object.
 * 
 * @author jonesc11
 */
public class JSONint extends JSON {
	private int mRep;
	
	/**
	 * @param parent is this object's parent
	 * @param rep is the integer that this object represents
	 * @require none
	 * @modify none
	 * @effect creates a new object
	 */
	public JSONint(JSON parent, int rep) {
		super(parent);
		this.mRep = rep;
	}
	
	/**
	 * @require none
	 * @modify none
	 * @effect none
	 * @return this.mRep
	 */
	public int getInt() {
		return this.mRep;
	}

	@Override
	public String toString() {
		// TODO: implement
		return null;
	}
}
