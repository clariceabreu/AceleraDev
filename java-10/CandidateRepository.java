package com.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.entity.User;

@Repository
public interface CandidateRepository extends JpaRepository<User, Long>  {	
	@Query("select c from acceleration a join a.candidates c join c.id where a.id = :accelerationId")
	public List<Candidate> findByAccelerationId(Long accelerationId);
	
	@Query("select c from company co join co.candidates c join c.id where co.id = :companyId")
	public List<Candidate> findByCompanyId(Long companyId);
}