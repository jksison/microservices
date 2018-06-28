package com.johnsison.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnsison.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
