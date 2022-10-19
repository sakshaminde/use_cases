package com.example.demo6;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<CarEntity, Integer>{
	
	
	  @Query(value ="SELECT Truckid FROM Car c JOIN Truck t ON c.No_of_tyres=t.No_of_tyres",
	  nativeQuery=true) public List<CarEntity> getjoin();
	 

}
