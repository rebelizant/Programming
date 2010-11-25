package com.lab111.labwork7;
/**
 * The class which represents the POST request.
 * @author rebelizant The student of group IO-92.
 *
 */
public class PostCommand extends HTTPCommand {
	
	private Receiver receiver = null;
	
	/**
	 * The constructor of this class.
	 * @param receiver The receiver of this command.
	 * @param priority The priority of this command.
	 */
	public PostCommand(Receiver receiver, int priority){
		this.receiver = receiver;
		this.setPriority(priority);
	}
	@Override
	public void execute() {
		this.receiver.postReply(this);
	}
}
