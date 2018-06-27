package com.johnsison.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnsison.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {


}
