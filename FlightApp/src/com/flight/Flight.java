package com.flight;

public class Flight {
	/**
	 * Fields represents the state of a class
	 */
	int passengers;
	int seats;
	
	/*
	 * Flight Constructor runs when flight class initializes
	 */
	public Flight(){
		passengers = 0;
		seats = 150;
	}
	
	public void add1Passenger() {
		if (passengers < seats) {
			passengers += 1;
		}
	}
	
	public int getNoOfPassengers() {
		return this.passengers;
	}
	

}
