package com.lab111.labwork5;
/**
 * The class which represents a window, extends Subject.
 * @author rebelizant
 *
 */
public class Window extends Subject {
	/**
	 * The name of this window.
	 */
	private String name;
	/**
	 * The height of this window.
	 */
	private int height = 0;
	/*
	 * The width of this window.
	 */
	private int width = 0;
	/**
	 * The code of event.
	 */
	private final static String event = "WINDOW_EVENT";
	/**
	 * The constructor of class Window.
	 * @param name The name of window.
	 */
	public Window(String name){
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
	 * The method for getting the height of this window. 
	 * @return The height of this window.
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * The method for setting the height of this window.
	 * @param height The new height of this window.
	 */
	public void setHeight(int height) {
		this.setSize(height, this.width);
	}
	/**
	 * The method for setting size of this window.
	 * @param height The new height of this window.
	 * @param width The new width of this window.
	 */
	public void setSize(int height, int width){
		this.height = height;
		this.width = width;
		inform();
	}
	/**
	 * The method for getting width of this window.
	 * @return The width of this window.
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * The method for setting width of this window.
	 * @param width The new width of this window.
	 */
	public void setWidth(int width) {
		this.setSize(width, this.height);
	}
	/**
	 * The method for getting the name of this window.
	 * @return The name of this window.
	 */
	public String getName() {
		return name;
	}
	/**
	 * The method for setting the name of this window.
	 * @param name The new name of this window.
	 */
	protected void setName(String name) {
		this.name = name;
	}
	@Override
	void changed() {
		System.out.println("The size of window "+this.getName()+" changed to: widht="+this.getWidth()+" height="+this.getHeight());	
	}
}
