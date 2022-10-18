package com.example.KPI.demo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController3 {
	
	@Autowired
	private EmployeeRepo er2;

	@GetMapping("/A")
	public List<String> getSample() {
		ArrayList<String> transformedvalues = new ArrayList<String>();
		for (EmployeeEntity emt2 : er2.findAll()) {
			EmployeeEntity temp2 = new EmployeeEntity();
			if(emt2.getEmployee_name().startsWith("a") || emt2.getEmployee_name().startsWith("A"))
			{
				temp2.setEmployee_name(emt2.getEmployee_name());
			}

			transformedvalues.add(temp2.getEmployee_name());
		}
		return transformedvalues;
	}

}
