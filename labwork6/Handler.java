package com.lab111.labwork6;
/**
 * The abstract class which represents a handler of http request.
 * @author rebelizant
 *
 */
public abstract class Handler {
	/**
	 * The successor of this object.
	 */
	private Handler handler;
	/**
	 * The status of capability to process a request.
	 */
	private boolean status = false;
	/**
	 * The method for setting a successor.
	 * @param handler The new successor.
	 */
	public void setHandler(Handler handler){
		this.handler = handler;
	}
	/**
	 * The method for getting the status.
	 * @return The status of capability to process a request.
	 */
	public boolean isStatus() {
		return this.status;
	}
	/**
	 * The method for setting a status.
	 * @param status The new status of this.
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/**
	 * The method for getting a successor.
	 * @return The successor of this object.
	 */
	public Handler getHandler(){
		return this.handler;
	}
	/**
	 * The method for processing a request.
	 * @param request The http request.
	 */
	public abstract void handleRequest(HTTPRequest request);
	/**
	 * The method which helps to know if an object can process a request. 
	 * @param request The http request.
	 * @return The capability to process a request.
	 */
	public abstract boolean hasHandle(HTTPRequest request);
}
