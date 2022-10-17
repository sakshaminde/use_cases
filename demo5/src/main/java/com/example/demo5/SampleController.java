package com.example.demo5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
		
	@Autowired
	private SchoolRepo sr;
	//private String last; 
	
	@GetMapping("/school")
	public List<SchoolEntity> getSample() {
		ArrayList<SchoolEntity> transformedvalues = new ArrayList<SchoolEntity>();
		//Set<Integer> s1 = new HashSet<Integer>();
		for (SchoolEntity emt : sr.findAll()) {
			SchoolEntity temp = new SchoolEntity();
			//temp.setId(emt.getId());
			temp.setName(emt.getName());
			transformedvalues.add(temp);
			
		}
		return transformedvalues;
	}
}
