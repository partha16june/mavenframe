package org.login;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Iterator {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add("partha");
		v.add("java");
		v.add("maven");
		v.add("frames");
		
		Enumeration<String> elements = v.elements();
		while (elements.hasMoreElements()) {
			String string = (String) elements.nextElement();
			System.out.println(string);
		}
		java.util.Iterator<String> i = v.iterator();
		while (i.hasNext()) {
			String string = (String) i.next();
			System.out.println(string);
		}
		ListIterator<String> lt = v.listIterator();
		while (lt.hasNext()) {
			String string = (String) lt.next();
			System.out.println(string);
		}
	}
	
	
}
