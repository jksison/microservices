package com.johnsison.vendor.service;

import java.util.List;

import com.johnsison.vendor.entities.Vendor;

public interface VendorService {
	
	Vendor saveVendor(Vendor vendor);

	Vendor updateVendor(Vendor vendor);

	void deleteVendor(Vendor vendor);

	Vendor getVendorById(int id);

	List<Vendor> getAllVendors();
	
}
