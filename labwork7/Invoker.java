package com.lab111.labwork7;
/**
 * The class represents a invoker of http request.
 * @author rebelizant The student of group IO-92.
 *
 */
public class Invoker {
	/**
	 * The http request.
	 */
	private HTTPCommand command; 
	/**
	 * The constructor of class Invoker.
	 * @param command A http request.
	 */
	public Invoker(HTTPCommand command){
		this.setCommand(command);
	}
	/**
	 * Setter for command.
	 * @param command A new command which represents http requests.
	 */
	public void setCommand(HTTPCommand command){
		this.command = command;
	}
	/**
	 * Getter for command.
	 * @return The command of this object.
	 */
	public HTTPCommand getCommand(){
		return this.command;
	}
	/**
	 * Method for performing this command.
	 */
	public void doCommand(){
		this.command.execute();
	}

}
