package com.lab111.labwork7;
/**
 * The client.
 * @author rebelizant The student of group IO-92.
 *
 */
public class Main {
	/**
	 * @param args The commands from command line.
	 */
	public static void main(String[] args) {
		QueueCommand qr = new QueueCommand(1);
		Receiver rec = new Receiver();
		
		GetCommand g1 = new GetCommand(rec, 1);
		GetCommand g2 = new GetCommand(rec, 3);
		
		PostCommand p1 = new PostCommand(rec, 5);
		PostCommand p2 = new PostCommand(rec, 4);
		
		QueueCommand qr2 = new QueueCommand(2);
		GetCommand g3 = new GetCommand(rec, 1);
		GetCommand g4 = new GetCommand(rec, 2);
		qr2.add(g3);
		qr2.add(g4);
		
		qr.add(qr2);
		
		qr.add(g2);
		qr.add(p1);
		qr.add(g1);
		qr.add(p2);
		g1.setPriority(9);
		qr.add(g1);
		Invoker command = new Invoker(qr);
		command.doCommand();
		
	}

}
