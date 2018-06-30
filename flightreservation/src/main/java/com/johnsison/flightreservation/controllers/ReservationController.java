package com.johnsison.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.johnsison.flightreservation.dto.ReservationRequest;
import com.johnsison.flightreservation.entities.Flight;
import com.johnsison.flightreservation.entities.Reservation;
import com.johnsison.flightreservation.repos.FlightRepository;
import com.johnsison.flightreservation.repos.PassengerRepository;
import com.johnsison.flightreservation.services.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("id") long id, ModelMap modelMap) {
		Flight flight = flightRepository.findById(id).get();
		modelMap.addAttribute("flight", flight);	
		return "completeReservation";
	}
	
	@RequestMapping(value = "/completeReservation", method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation created succesfully.Reservation ID is " 
				+ reservation.getId());
		return "reservationConfirmation";
	}
}
