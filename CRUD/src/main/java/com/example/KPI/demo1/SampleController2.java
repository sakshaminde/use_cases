package com.example.KPI.demo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleController2 {
	
	@Autowired
	private EmployeeRepo er1;

	@GetMapping("/Id")
	public List<Integer> getSample() {
		ArrayList<Integer> transformedvalues = new ArrayList<Integer>();
		for (EmployeeEntity emt1 : er1.findAll()) {
			EmployeeEntity temp1 = new EmployeeEntity();
			temp1.setId(emt1.getId());
			transformedvalues.add(temp1.getId());
		}
		return transformedvalues;
	}

}
