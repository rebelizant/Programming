package com.lab111.labwork7;

import java.util.Arrays;
/**
 * The class which represents the queue of commands.
 * @author rebelizant The student of group IO-92.
 *
 */
public class QueueCommand extends HTTPCommand {
	/**
	 * Array of commands.
	 */
	public HTTPCommand[] requests = new HTTPCommand[0]; 
	/**
	 * The constructor of class QueueCommand.
	 * @param priority The priority of this queue of commands.
	 */
	public QueueCommand(int priority){		
		this.setPriority(priority);
	}
	/**
	 * The constructor of class QueueCommand.
	 * @param priority The priority of this queue of commands.
	 * @param request The command.
	 */
	public QueueCommand(int priority, HTTPCommand request){
		this(priority);
		this.requests = new HTTPCommand[1];
		this.requests[0] = request;
	} 
	/**
	 * The constructor of class QueueCommand.
	 * @param priority The priority of this queue of commands.
	 * @param requests The array of commands.
	 */
	public QueueCommand(int priority, HTTPCommand[] requests){
		this(priority);
		this.setRequests(requests);
	}
	/**
	 * The Setter for array of commands.
	 * @param requests The new array of commands.
	 */
	private void setRequests(HTTPCommand[] requests){
		this.requests = requests;
	}
	/**
	 * Method for checking the same elments. 
	 * @param request New http request.
	 * @return True if there is this new request, else return false.
	 */
	private boolean hasElement(HTTPCommand request){
		for(int i = 0; i < this.requests.length; i++){
			if(this.requests[i] == request)
				return true;
		}
		return false;
	}
	/**
	 * Method for adding a new command to this queue.
	 * @param request The new command.
	 */
	public void add(HTTPCommand request){
		if(this.hasElement(request))
			return;
		HTTPCommand[] buf = new HTTPCommand[this.requests.length+1];
		for(int i = 0; i < buf.length-1; i++){
			buf[i] = this.requests[i];
		}
		buf[buf.length-1] = request;
		this.setRequests(null);
		this.setRequests(buf);
		buf = null;
		request.parent = this;
		Arrays.sort(this.requests, new CommandComparator());
	}
	/**
	 * The method for deleting a command from queue of commands. 
	 * @param request Deleting command.
	 */
	public void remove(HTTPCommand request){
		if(!this.hasElement(request))
			return;
		HTTPCommand[] buf = new HTTPCommand[this.requests.length-1];
		int j = -1;
		for(int i = 0; i < this.requests.length; i++){
			if(this.requests[i] == request){
				j = i;
			}
		}
		for(int i = 0; i < j; i++){
			buf[i] = this.requests[i];
		}
		for(int i = j; i < buf.length; i++){
			buf[i] = this.requests[i+1];
		}
		this.requests = null;
		this.requests = buf;
		buf = null;
		Arrays.sort(this.requests, new CommandComparator());
	}
	@Override
	public void execute() {
		System.out.println("Macro command ---- begin");
		for(int i = 0; i < this.requests.length; i++){
			System.out.println();
			this.requests[i].execute();
		}
		System.out.println("Macro command ==== end.");
	}
	
}
