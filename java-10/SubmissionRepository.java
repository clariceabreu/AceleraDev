package com.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.entity.User;

@Repository
public interface SubmissionRepository extends JpaRepository<User, Long>  {	
	@Query("select max(s.score) from submission s where s.challengeId = :challengeId")
	public Optional<Submission> findHigherScoreByChallengeId(Long challengeId);
	
	@Query("select c.submission from challenge c join c.accelerations a where c.id = :challengeId and a.id = :accelerationId")
	public List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId);
}