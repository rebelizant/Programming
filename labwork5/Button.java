package com.lab111.labwork5;
/**
 * The class which represents a button, extends Subject.
 * @author rebelizant
 *
 */
public class Button extends Subject {	
	/**
	 * The name of button.
	 */
	private String name;
	/**
	 * The amount of clicking on this button.
	 */
	private int amountOfClicks=0;
	/**
	 * The code of event.
	 */
	private final static String event = "BUTTON_EVENT";	
	/**
	 * The constructor of class Button.
	 * @param name The name of button.
	 */
	public Button(String name){
		this.setName(name);
	}
	/**
	 * The getter of event.
	 * @return The code of event.
	 */
	public String getEvent() {
		return event;
	}
	/**
	 * The method for clicking  a button.
	 */
	public void click(){
		this.inform();
	}	
	/**
	 * The getter for name of this button.
	 * @return The name of button.
	 */
	public String getName() {
		return name;
	}
	/**
	 * The setter for name of this button. 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	void changed() {
		this.amountOfClicks++;
		System.out.println("The button named "+this.getName()+" was clicked at "+this.amountOfClicks+" time.");
	}
}
