package com.johnsison.flightreservation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="RESERVATION")
public class Reservation extends AbstractEntity {

	@Column(name="CHECKED_IN")
	private Boolean checkIn;
	@Column(name="NUMBER_OF_BAGS")
	private int numberOfBags;
	@OneToOne(targetEntity = Passenger.class)
	private Passenger passenger;
	@OneToOne(targetEntity = Flight.class)
	private Flight flight;

	public Boolean getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Boolean checkIn) {
		this.checkIn = checkIn;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}
