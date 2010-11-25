package com.lab111.labwork6;
/**
 * The class which represents a post request.
 * @author rebelizant
 *
 */
public class Post implements HTTPRequest {
	/**
	 * The constructor of class Post.
	 */
	public Post(){		
	}
	@Override
	public String reply() {
		return "POST";
	}
}
