package com.example.demo7;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Clients")
public class ClientsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Client_id;
	private int Ins_id;
	private String Client_name;
	private String Client_plan;
	private String Ins_name; 
	private String Ins_det; 
	private String Ins_type;
	 
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
	public String getIns_type() {
		return Ins_type;
	}
	public void setIns_type(String ins_type) {
		Ins_type = ins_type;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_Ins_id")
	public int getClient_id() {
		return Client_id;
	}
	public void setClient_id(int client_id) {
		Client_id = client_id;
	}
	public int getIns_id() {
		return Ins_id;
	}
	public void setIns_id(int ins_id) {
		Ins_id = ins_id;
	}
	public String getClient_name() {
		return Client_name;
	}
	public void setClient_name(String client_name) {
		Client_name = client_name;
	}
	public String getClient_plan() {
		return Client_plan;
	}
	public void setClient_plan(String client_plan) {
		Client_plan = client_plan;
	}

}
