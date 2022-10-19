package com.example.demo6;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepo extends JpaRepository<TruckEntity, Integer>{
	
	@Query(value = "SELECT * FROM Truck t INNER JOIN Car c ON t.No_of_tyres=c.No_of_tyres", nativeQuery=true)	
	public List<TruckEntity> getjoin();
}