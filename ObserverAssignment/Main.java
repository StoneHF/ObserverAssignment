package org.trishinfotect.observer;
public class Main {     // new public class called main

	public static void main(String args[]) {        // public class main with string objects
		Company Netflix = new Company("Netflix", "Nflix");  // new company vriable being given the value of netflix/Amazon etc
        Company Amazon = new Company("Amazon", "Azon");
        Company AppleTV = new Company("Apple TV", "AppTV");
		

		
		Subscriber rachael = new Subscriber("Rachael");   //  new subscriber added and given name
		Subscriber michael = new Subscriber("Michael");
		Subscriber kim = new Subscriber("Kim");
        Subscriber steve = new Subscriber("Steve");
		Subscriber sabina = new Subscriber("Sabina");

		
		Netflix.addSubscriber(rachael);   //adds selected subscriber to company netflix using observer
		Netflix.addSubscriber(michael);
		Netflix.addSubscriber(kim);

        Amazon.addSubscriber(sabina);    //adds selected subscriber to company Amazon using observer
        Amazon.addSubscriber(steve);
        Amazon.addSubscriber(rachael);
        Amazon.addSubscriber(michael);


       AppleTV.addSubscriber(sabina);   //adds selected subscriber to company AppleTV using observer
       AppleTV.addSubscriber(steve); 
       AppleTV.addSubscriber(kim);
       AppleTV.addSubscriber(rachael);
       AppleTV.addSubscriber(michael);



	

		Netflix.email("Hello Flixers! Check out Henry Cavils new movie with us!");     // sends email from netflix to subscribers
		Netflix.removeSubscriber(rachael); // removes selected subscriber from netflix
		Netflix.email(" New movies to be recommended to you soon!");  // sends email from netflix to subscribers

        Amazon.email(" Don't dorget to check your sunscription!"); // sends email from Amazon to subscribers
		Amazon.removeSubscriber(sabina); // removes selected subscriber from Amazon
        Amazon.removeSubscriber(steve);  // removes selected subscriber from Amazon
		Amazon.email(" Subscription price change"); // sends email from Amazon to subscribers

        AppleTV.email("Hello Everyone! Don't forget to watch Ewan McGregors new show!"); // sends email from AppleTV to subscribers
		AppleTV.removeSubscriber(rachael);  // removes selected subscriber from AppleTV
        AppleTv.removeSubscriber(kim);      // removes selected subscriber from AppleTV
        AppleTV.removeSubscriber(michael);  // removes selected subscriber from APPLEtv
		AppleTV.email(" New movies to be recommended to you soon!"); // sends email from AppleTV to subscribers
	}
}