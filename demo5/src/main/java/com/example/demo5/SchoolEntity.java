package com.example.demo5;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school")
public class SchoolEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
//	private Integer id;
	private String Name;
//	public Integer getId() {
//	return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public Object split(char c) {
		// TODO Auto-generated method stub
		return 'a';
	}
	
	
}
