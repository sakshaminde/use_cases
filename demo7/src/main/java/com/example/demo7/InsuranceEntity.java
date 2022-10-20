package com.example.demo7;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Insurance")
public class InsuranceEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int Ins_id;
	private String Ins_type;
	private String Ins_name;
	private String Ins_det;
	
	
	public int getIns_id() {
		return Ins_id;
	}
	public void setIns_id(int ins_id) {
		Ins_id = ins_id;
	}
	public String getIns_type() {
		return Ins_type;
	}
	public void setIns_type(String ins_type) {
		Ins_type = ins_type;
	}
	public String getIns_name() {
		return Ins_name;
	}
	public void setIns_name(String ins_name) {
		Ins_name = ins_name;
	}
	public String getIns_det() {
		return Ins_det;
	}
	public void setIns_det(String ins_det) {
		Ins_det = ins_det;
	}
	

}
