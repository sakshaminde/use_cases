package com.example.demo7;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepo extends JpaRepository<ClientsEntity, Integer>{
	
//	@Query(value = "select Client_name, Client_plan, Ins_name, Ins_det, Ins_type  from Insurance join Clients on Insurance.Ins_id = Clients.Ins_id", nativeQuery=true)	
	@Query(value = "select *  from Insurance join Clients on Insurance.Ins_id = Clients.Ins_id", nativeQuery=true)		
	public List<ClientsEntity> getjoin();

}
