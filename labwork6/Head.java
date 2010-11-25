package com.lab111.labwork6;
/**
 * The class which represents the head request.
 * @author rebelizant
 *
 */
public class Head implements HTTPRequest {
	/**
	 * The constructor of class Head.
	 */
	public Head(){
	}
	@Override
	public String reply() {
		return "HEAD";
	}
}
