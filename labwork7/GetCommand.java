package com.lab111.labwork7;

import java.util.Arrays;

/**
 * The Class which represents the GET request.
 * @author rebelizant The student of group IO-92.
 *
 */
public class GetCommand extends HTTPCommand {
	/**
	 * The 
	 */
	private Receiver receiver = null; 
	/**
	 * The constructor of this class.
	 * @param receiver The receiver of command.
	 * @param priority The priority for new command.
	 */
	public GetCommand(Receiver receiver, int priority){
		this.receiver = receiver;
		this.setPriority(priority);
	}
	@Override
	public void execute() {
		receiver.getReply(this);
	}

}
