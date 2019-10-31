package com.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.entity.User;

@Repository
public interface CompanyRepository extends JpaRepository<User, Long>  {	
	@Query("select c.company from candidate c join c.acceleration a where a.id = :accelerationId")
	public List<Company> findbyAccelerationId(Long accelerationId);
	
	@Query("select c.company from candidate c join c.user u where u.id = :accelerationId")
	public List<Company> findByUserId(Long userId);
}