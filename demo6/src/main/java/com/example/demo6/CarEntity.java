package com.example.demo6;

//import java.util.HashSet;
//import java.util.Set;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Car")
public class CarEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Carid;
	private String Car_name;
	private int No_of_tyres;
	
	//@OneToMany(mappedBy = "CarEntity", cascade = CascadeType.ALL, orphanRemoval = true)
	//private Set<CarEntity> cd = new HashSet<>();
	
	public int getCarid() {
		return Carid;
	}
	public void setCarid(int carid) {
		Carid = carid;
	}
	public String getCar_name() {
		return Car_name;
	}
	public void setCar_name(String car_name) {
		Car_name = car_name;
	}
	public int getNo_of_tyres() {
		return No_of_tyres;
	}
	public void setNo_of_tyres(int no_of_tyres) {
		No_of_tyres = no_of_tyres;
	}
	
	
	

}
