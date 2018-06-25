package com.johnsison.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnsison.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer>{

}
