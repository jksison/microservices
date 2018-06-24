package com.johnsison.customerdata.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.johnsison.customerdata.dal.entities.CustomerData;
import com.johnsison.customerdata.dal.repos.CustomerDataRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdataApplicationTests {

	@Autowired
	private CustomerDataRepository customerDataRepository;

	@Test
	public void testCreateStudent() {
		
		CustomerData customerData = new CustomerData();
		customerData.setName("John");
		customerData.setEmail("johnsison@test.com");
		
		customerDataRepository.save(customerData);
	}
	
	@Test
	public void testFindStudentById() {
		CustomerData customerData = customerDataRepository.findById(1l).get(); 
		System.out.println(customerData);
	}

	@Test
	public void testUpdateStudent() {
		CustomerData customerData = customerDataRepository.findById(1l).get(); 
		customerData.setEmail("sisonjohn@test.com");
		
		customerDataRepository.save(customerData);
	}
	
	@Test
	public void testDeleteStudent() {
		CustomerData customerData = new CustomerData();
		customerData.setId(1l);
		
		customerDataRepository.delete(customerData);
	}
}
