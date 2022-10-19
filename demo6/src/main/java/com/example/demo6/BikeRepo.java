package com.example.demo6;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepo extends JpaRepository<BikeEntity, Integer>{

}
