package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.PostDetailsAndUserDetails;

import jakarta.transaction.Transactional;


@Repository
@Transactional
public interface PostAndUserRepository extends JpaRepository<PostDetailsAndUserDetails, Integer> {

	@Query(value = "select * from post_details_and_user_details p where p.username=:username", nativeQuery = true)
	List<PostDetailsAndUserDetails> getUserList(String username);

	
}
