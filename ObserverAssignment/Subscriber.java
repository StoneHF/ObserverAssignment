package org.trishinfotect.observer;

public class Subscriber implements Observer {  // new class called Subscriber that implements the observer interface

	protected String name;   // a variable called name with a string data type that can only be used within the public class Subscriber

	public Subscriber(String name) {   //method subscriber with input of string varibale name
		super();   // calls back to constructors parent method
		this.name = name;    // this subscriber name is equal to name entered 
	}

	@Override
	public void notification(String handle, String email) {    // method notification with the input of handle and email that are both string data types
		System.out.printf("'%s' received Email notification from Handle: '%s', Email: '%s'\n", name, handle, email);    // prints out notification to a subscribers interface
	}

}