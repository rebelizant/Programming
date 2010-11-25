package com.lab111.labwork7;

import java.util.Comparator;
/**
 * Class represents the comparator commands priority.
 * @author rebelizant The student of group IO-92.
 *
 */
public class CommandComparator implements Comparator {
	/**
	 * The constructor of class CommandComparator.
	 */
	public CommandComparator(){}
	@Override
	public int compare(Object o1, Object o2) {
		int pri1 = ((HTTPCommand)o1).getPriority();
		int pri2 = ((HTTPCommand)o2).getPriority();
		if(pri1 > pri2){
			return 1;
		} else {
			if(pri1 < pri2){
				return -1;
			} else
				return 0;
		}
	}

}
