package com.johnsison.flightreservation.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.johnsison.flightreservation.entities.User;
import com.johnsison.flightreservation.repos.UserRepository;

@Controller
public class UserController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		LOGGER.info("Inside showRegistrationPage()");
		return "login/registerUser";
	}
	
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user) {
		LOGGER.info("Inside registerUser(): " + user);
		userRepository.save(user);
		return "login/login";
	}
	
	@RequestMapping(value = "/showLogin")
	public String showLogin() {
		LOGGER.info("Inside showLogin()");
		return "login/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, 
						@RequestParam("password") String password,
						ModelMap modelMap) {
		LOGGER.info("Inside login() and email is " + email);
		User user = userRepository.findByEmail(email);
		if (user != null && password.equals(user.getPassword())) {
			return "findFlights";
		} else {
			modelMap.addAttribute("msg", "Invalid email or password. Please try again.");
		}
		
		return "login/login";
	}
}
