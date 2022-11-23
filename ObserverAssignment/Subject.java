package org.trishinfotect.observer;

public interface Subject {     // creates new interface called Subject

	public void addSubscriber(Observer observer); 

	public void removeSubscriber(Observer observer);
	// creates two observers for adding a subscriber and removing one

	public void notifySubscribers(String email); // method that sends out a email to subscribers
}