package com.johnsison.flightcheckin.intergration;

import com.johnsison.flightcheckin.intergration.dto.Reservation;
import com.johnsison.flightcheckin.intergration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	public Reservation updateReservation(ReservationUpdateRequest request);
}
