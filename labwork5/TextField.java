package com.lab111.labwork5;
/**
 * The class which represents a text field, extends Subject.
 * @author rebelizant
 *
 */
public class TextField extends Subject {
	/**
	 * The length of this text field.
	 */
	private int length=0;
	/**
	 * The code of event.
	 */
	private final static String event = "TEXTFIELD_EVENT";
	/**
	 * The constructor of class TextField.
	 * @param length The length of text field.
	 */
	public TextField(int length){
		this.setLength(length);
	}

	/**
	 * The getter of event.
	 * @return The code of event.
	 */
	public String getEvent() {
		return event;
	}
	/**
	 * The text of text field.
	 */
	private String text="";
	/**
	 * The method getting a text from this text field.
	 * @return The string of this text field.
	 */
	public String getText() {
		return text;
	}
	/**
	 * The method for setting a text in this text field.
	 * @param text A new string.
	 */
	public void setText(String text) {
		this.text = text;
		this.inform();
	}
	/**
	 * The method for setting the length of this text field.
	 * @param length
	 */
	protected void setLength(int length) {
		this.length = length;
	}
	@Override
	void changed() {
		System.out.println("Text changed to: "+this.getText());
	}


}
