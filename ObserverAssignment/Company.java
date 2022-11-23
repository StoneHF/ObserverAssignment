package org.trishinfotect.observer;

import java.util.ArrayList;
import java.util.List;

public class Company implements Subject {    //creates a new class called Company that implements the subject interface

	protected List<Observer> observers = new ArrayList<Observer>();     
	protected String name;       //  new protected variable called name with a string data type can only be used company class
	protected String handle;     //  new protected variable called handle with a string data type can only be used company class

	public Company(String name, String handle) {
		super();      // calls back to constructors parent method
		this.name = name;             // this company name is equal to name entered 
		this.handle = "#" + handle;    // this company handle is equal to handle entered 
	}

	public String getName() {
		return name;            // get method gets the variable value of the string variable name and display name
	}

	public void setName(String name) {
		this.name = name;      //  set method sets the value of the variable name
	}

	public String getHandle() {
		return handle;           // get method gets the variable value of the string variable handle and returns the handle information
	}

	public void email(String email) {
		System.out.printf("\nName: %s, Email: %s\n", name, email);           //  displays name email to user interface
		notifySubscribers(email);        // subscribers will recieve email
	}

	@Override        // overrides the bass class method with a new value 
	public synchronized void addSubscriber(Observer observer) {   // new public sync method addSubscriber, syncronized so threads can access this class atomically
		observers.add(observer); // adds observer
	}

	@Override       // overrides the bass class method with a new value 
	public synchronized void removeSubscriber(Observer observer) { // new public sync method removeSubscriber, syncronized so threads can access this class atomically
		
		observers.remove(observer);  // removed observer
	}

	@Override   // overrides the bass class method with a new value 
	public void notifySubscribers(String email) {
		observers.forEach(observer -> observer.notification(handle, email));    // itterates through each observer notifiying subscribers with email and handle
	}

}