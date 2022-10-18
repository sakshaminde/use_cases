package com.example.KPI.demo1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@Autowired
	private EmployeeRepo er;// up to date

	@GetMapping("/Name")
	public List<String> getSample() {
		ArrayList<String> transformedvalues = new ArrayList<String>();
		for (EmployeeEntity emt : er.findAll()) {
			EmployeeEntity temp = new EmployeeEntity();
			//temp.setId(emt.getId());
			/*if (emt.getEmployee_name().contains("$")) {
				temp.setEmployee_name(emt.getEmployee_name().replaceAll("\\$", ""));
			}*/
			temp.setEmployee_name(emt.getEmployee_name());
			transformedvalues.add(temp.getEmployee_name());
		}
		return transformedvalues;
	}
}
