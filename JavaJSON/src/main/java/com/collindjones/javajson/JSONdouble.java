package com.collindjones.javajson;

/**
 * This object represents a double found in a JSON object.
 * 
 * @author jonesc11
 */
public class JSONdouble extends JSON {
	private double mRep;
	
	/**
	 * @param parent is this object's parent.
	 * @param rep is the double that this object represents.
	 * @require none
	 * @modify none
	 * @effect creates a new JSONdouble object
	 */
	public JSONdouble(double rep) {
		this.mRep = rep;
	}
	
	/**
	 * @require none
	 * @modify none
	 * @effect none
	 * @return this.mRep
	 */
	public double getDouble() {
		return this.mRep;
	}

	@Override
	public String toString() {
		return (new Double(this.mRep)).toString();
	}
}
