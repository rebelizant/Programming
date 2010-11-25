package com.lab111.labwork5;
/**
 * The observer interface.
 * @author rebelizant
 *
 */
public interface Observer {
	/**
	 * The method for updating status.
	 * @param sub An object of class Subject.
	 */
	public void update(Subject sub);
}
