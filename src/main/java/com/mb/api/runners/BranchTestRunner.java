package com.mb.api.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mb.api.persistance.entity.Branch;
import com.mb.api.persistance.repository.BranchRepository;

//@Component
public class BranchTestRunner implements CommandLineRunner
{
	
	@Autowired
	private BranchRepository branchRepository;
	
	@Override
	public void run(String... args) throws Exception
	{
		Branch branch = new Branch();
		
		branch.setName("HDFC Bank Umarkhed");
		branch.setLocation("Dhanaki Road Umarkhed");
		branch.setCode("HDFC445206");
		
		branchRepository.save(branch);
	}

}
