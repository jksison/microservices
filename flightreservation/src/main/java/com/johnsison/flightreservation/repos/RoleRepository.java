package com.johnsison.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnsison.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
