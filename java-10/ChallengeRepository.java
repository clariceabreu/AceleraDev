package com.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.entity.User;

@Repository
public interface ChallengeRepository extends JpaRepository<User, Long>  {
	@Query("select a.challenge from user u join u.candidates ca join ca.id c join c.acceleration a where u.id = :userId and a.id = :accelerationId")
	public Optional<Challenge> findByAccelerationIdAndUserId(String name);
}