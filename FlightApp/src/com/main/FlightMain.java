package com.main;

import com.flight.Flight;

public class FlightMain {

	public static void main(String[] args) {
		System.out.println("Scheduling a flight");
		Flight boeing777 = new Flight();
		boeing777.add1Passenger();
		boeing777.add1Passenger();
		System.out.println("Number of passengers in <" + boeing777.toString() +"> is "+boeing777.getNoOfPassengers()+".");

	}

}
