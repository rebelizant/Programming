package com.lab111.labwork7;
/**
 * The receiver of http request.
 * @author rebelizant The student of group IO-92.
 *
 */
public class Receiver {
	/**
	 * The constructor of class Receiver. 
	 */
	public Receiver(){}
	/**
	 * Method for receiving GET request.
	 * @param get The GET request.
	 */
	public void getReply(GetCommand get){
		System.out.println( "GET"+ get.priority);
	}
	/**
	 * Method for receiving POST request.
	 * @param post POST request.
	 */
	public void postReply(PostCommand post){
		System.out.println("POST"+post.priority);
	}
	
}
