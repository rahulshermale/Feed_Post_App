package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Login;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface RegisterRepo extends JpaRepository<Login, Integer> {

//	@Query("select * from Login" )
	public default Login login(String user, int id) {

		return null;

	}

	@Query(value = "SELECT *  FROM login l WHERE l.username = :username", nativeQuery = true)
	Optional<Login> findByUsername(@Param("username") String username);

	@Query(value = "select * from login p where p.username=:name", nativeQuery = true)
	List<Login> listtype(@Param("name") String name);

	@Query(value="select * from login l where l.id=:id",nativeQuery = true)
	Login findAllByyId(int id);

}
