package com.example.demo6;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bike")
public class BikeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Bikeid;
	private String Bike_name;
	private int No_of_tyres;
	
	public int getBikeid() {
		return Bikeid;
	}
	public void setBikeid(int bikeid) {
		Bikeid = bikeid;
	}
	public String getBike_name() {
		return Bike_name;
	}
	public void setBike_name(String bike_name) {
		Bike_name = bike_name;
	}
	public int getNo_of_tyres() {
		return No_of_tyres;
	}
	public void setNo_of_tyres(int no_of_tyres) {
		No_of_tyres = no_of_tyres;
	}
	

}
