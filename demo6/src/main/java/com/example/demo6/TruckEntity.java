package com.example.demo6;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Truck")
public class TruckEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Truckid;
	private String Truck_name;
	private int No_of_tyres;
	
	public int getTruckid() {
		return Truckid;
	}
	public void setTruckid(int truckid) {
		Truckid = truckid;
	}
	public String getTruck_name() {
		return Truck_name;
	}
	public void setTruck_name(String truck_name) {
		Truck_name = truck_name;
	}
	public int getNo_of_tyres() {
		return No_of_tyres;
	}
	public void setNo_of_tyres(int no_of_tyres) {
		No_of_tyres = no_of_tyres;
	}
	

}
