package com.johnsison.customerdata.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.johnsison.customerdata.dal.entities.CustomerData;

public interface CustomerDataRepository extends CrudRepository<CustomerData, Long> {

}
