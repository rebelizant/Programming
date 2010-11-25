package com.lab111.labwork5;
/**
 * The testing class
 * @author rebelizant
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		Button b = new Button("SPECBUT");
		GUIObserver o = new GUIObserver();
		GUIObserver o1 = new GUIObserver();
		b.attach(o);
		b.attach(o);
		b.detach(o1);
		b.click();
		b.click();
		
		Window w = new Window("window");
		w.attach(o1);
		w.setSize(133, 123);
		
		TextField tf = new TextField(10);
		tf.attach(o1);
		tf.setText("terte");
		

		
	}

}
