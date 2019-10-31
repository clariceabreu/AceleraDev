package com.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.entity.User;

@Repository
public interface AccelerationRepository extends JpaRepository<User, Long>  {	
	@Query("select c.acceleration from candidate c join c.company co where co.id = :companyId")
	public List<Company> findByCompanyId(Long companyId);
	