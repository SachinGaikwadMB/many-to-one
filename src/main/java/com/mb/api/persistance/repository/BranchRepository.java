package com.mb.api.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mb.api.persistance.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer>
{
	Branch findByBranchId(Integer branchId);
}
