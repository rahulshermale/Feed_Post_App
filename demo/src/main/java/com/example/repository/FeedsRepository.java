package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Feeds;
import com.example.entity.Login;
@Repository
@Transactional
public interface FeedsRepository  extends JpaRepository<Feeds, Integer>{

//	 @Query("SELECT u FROM Feeds u JOIN FETCH u.address")
	@Query("SELECT u.id, u.username, u.emailid, u.password, f.name,f.post FROM Feeds f JOIN Login u ON f.id = u.id")
	 List<Feeds> findAllUsersWithAddress();
	
	
	 @Modifying
	    @Query(value = "DELETE FROM Feeds f WHERE f.id =:id", nativeQuery = true)
	    void deleteByUsername(int id);
	
	 @Query(value = "select * from Feeds p where p.id=:id", nativeQuery = true)
		List<Feeds> listtype(@Param("id") int id);
	
	 @Query(value="select f.*,l.* from Feeds f,login l where f.id=:id ",nativeQuery=true)
	 Feeds getDataFeedLogin(@Param("id") int id);
	 
	 
//	@Query("update feeds f set f.name = :name, f.post= :post, where f.id = :id" )
//	void updatePost(@Param("name")String name, @Param("post") String post,@Param("id") int id);
	
	

}
