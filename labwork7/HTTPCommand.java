package com.lab111.labwork7;

import java.util.Arrays;

/**
 * Class which represents the HTTP request.
 * @author rebelizant The sudent of group IO-92.
 *
 */
public abstract class HTTPCommand {
	/**
	 * The priority of command.
	 */
	protected int priority = 0;
	
	protected QueueCommand parent = null;
	/**
	 * Method for doing command.
	 */
	public abstract void execute();
	/**
	 * The setter for priority.
	 * @param priority The new priority for command.
	 */
	public void setPriority(int priority){
		this.priority = priority;
		if (this.parent != null)
			Arrays.sort(this.parent.requests, new CommandComparator());
	}
	/**
	 * The getter for priority.
	 * @return The priority of this command.
	 */
	public int getPriority(){
		return this.priority;
	}
	
	
}
