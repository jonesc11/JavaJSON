package com.collindjones.javajson;

/**
 * This object represents any object found in JSON files. All objects in this
 * library is a subclass of this.
 * 
 * @author jonesc11
 */
public abstract class JSON {
	protected JSON mParent;
	
	/**
	 * @param parent is this object's parent.
	 * @require none
	 * @modify none
	 * @effect creates a new object.
	 */
	public JSON(JSON parent) {
		this.mParent = parent;
	}
	
	@Override
	public abstract String toString();
}
