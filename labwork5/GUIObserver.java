package com.lab111.labwork5;
/**
 * The observer for GUI.
 * @author rebelizant
 *
 */
public class GUIObserver implements Observer {
	@Override
	public void update(Subject sub) {
		if(sub.getEvent().equals("BUTTON_EVENT")){			
			sub.changed();
		} else {
			if(sub.getEvent().equals("TEXTFIELD_EVENT")){
				sub.changed();
			} else {
				if(sub.getEvent().equals("WINDOW_EVENT")){
					sub.changed();
				} else {
					System.out.println(sub.getEvent());
				}
			}
		}
	}

}
