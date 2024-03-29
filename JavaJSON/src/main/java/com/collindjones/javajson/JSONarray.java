package com.collindjones.javajson;

import java.util.ArrayList;
import java.util.List;

/**
 * This object represents an array found in JSON format.
 * 
 * @author jonesc11
 */
public class JSONarray extends JSON {
	private List<JSON> mRep;
	
	/**
	 * @param parent is the object's parent.
	 * @require none
	 * @modify none
	 * @effect creates a new JSONarray object.
	 */
	public JSONarray() {
		this.mRep = new ArrayList<JSON>();
	}
	
	/**
	 * @require none
	 * @modify none
	 * @effect none
	 * @return a copy of this list
	 */
	public ArrayList<JSON> getArray() {
		return new ArrayList<JSON>(this.mRep);
	}
	
	/**
	 * @param toAppend the JSON element to append
	 * @require none
	 * @modify this
	 * @effect appends the given object to the representation
	 * @throws IllegalArgumentException if toAppend is null
	 */
	public void append(JSON toAppend) throws IllegalArgumentException {
		if (toAppend == null) {
			throw new IllegalArgumentException("toAppend cannot be null.");
		}
		this.mRep.add(toAppend);
	}

	@Override
	public String toString() {
		if (this.mRep.size() == 0) {
			return "[]";
		}
		
		String ret = "[" + this.mRep.get(0).toString();
		for (int i = 1;  i < this.mRep.size(); ++i) {
			ret += "," + this.mRep.get(i).toString();
		}
		
		ret += "]";
		
		return ret;
	}
}
