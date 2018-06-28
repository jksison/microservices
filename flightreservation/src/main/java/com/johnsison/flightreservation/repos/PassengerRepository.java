package com.johnsison.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnsison.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
