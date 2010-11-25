package com.lab111.labwork5;

import java.util.ArrayList;
/**
 * The superclass of widgets.
 * @author rebelizant
 *
 */
public abstract class Subject {
	/**
	 * The array of listeners.
	 */
	protected ArrayList<Observer> observers = new ArrayList<Observer>();
	/**
	 * The code of event.
	 */
	private final static String event = "ABSTRACT";
	/**
	 * The getter of event.
	 * @return The code of event.
	 */
	public abstract String getEvent();
	/**
	 * Method for adding listener to a list of listeners.
	 * @param o An object of Observer.
	 */
	public void attach(Observer o){
		if(this.observers.indexOf(o) == -1){
			this.observers.add(o);
			//System.out.println(o.toString()+" was added.");
		}
	}
	/**
	 * The menthod for deleting observer from observers list.
	 * @param o
	 */
	public void detach(Observer o){
		if(this.observers.indexOf(o) != -1){
			this.observers.remove(o);
		}
	}
	/**
	 * The method for notifying all attached observers. 
	 */
	public void inform(){
		for(int i = 0; i < this.observers.size(); i++){
			this.observers.get(i).update(this);
		}
	}
	/**
	 * The method which informs of changes.
	 */
	abstract void changed();

}
