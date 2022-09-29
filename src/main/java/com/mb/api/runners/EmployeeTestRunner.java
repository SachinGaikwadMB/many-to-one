package com.mb.api.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mb.api.persistance.entity.Employee;
import com.mb.api.persistance.repository.BranchRepository;
import com.mb.api.persistance.repository.EmployeeRepository;

@Component
public class EmployeeTestRunner implements CommandLineRunner
{	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private BranchRepository branchRepository;
	
	@Override
	public void run(String... args) throws Exception
	{
		Employee employee = new Employee();
		
		employee.setFirstName("Ankit");
		employee.setLastName("Purame");
		employee.setDesignation("Sales Officer");
		employee.setContact("7810547659");
		employee.setBranch(branchRepository.findByBranchId(1));
		
		employeeRepository.save(employee);
		   
	}

}
