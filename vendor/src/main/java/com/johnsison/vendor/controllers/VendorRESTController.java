package com.johnsison.vendor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.johnsison.vendor.entities.Vendor;
import com.johnsison.vendor.repos.VendorRepository;

@RestController
public class VendorRESTController {

	@Autowired
	VendorRepository vendorRepository;
	
	@GetMapping("/vendors/")
	public List<Vendor> getVendors() {
		return vendorRepository.findAll();
	}
	
	@GetMapping("/vendors/{id}")
	public Vendor getVendor(@PathVariable("id") int id) {
		return vendorRepository.findById(id).get();
	}
	
	@PutMapping("/vendors")
	public Vendor updateVendor(@RequestBody Vendor vendor) {
		return vendorRepository.save(vendor);
	}
	
	@PostMapping("/vendors")
	public Vendor createVendor(@RequestBody Vendor vendor) {
		return vendorRepository.save(vendor);
	}
	
	@DeleteMapping("/vendors/{id}")
	public List<Vendor> deleteVendor(@PathVariable("id") int id) {
		vendorRepository.deleteById(id);
		return vendorRepository.findAll();
	}
	
	
}
