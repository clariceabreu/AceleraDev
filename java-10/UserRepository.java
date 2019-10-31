package com.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {	
	@Query("select c.user from acceleration a join a.candidates ca join ca.id c where a.name  = :name")
	public List<User> findByAccelerationName(String name);

	@Query("select c.user from company co join co.candidates ca join ca.id c where co.id  = :companyId")
	public List<User> findByCompanyId(Long companyId);
}