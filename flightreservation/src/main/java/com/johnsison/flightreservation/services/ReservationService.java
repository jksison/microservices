package com.johnsison.flightreservation.services;

import com.johnsison.flightreservation.dto.ReservationRequest;
import com.johnsison.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight (ReservationRequest request);
}
