package com.example.KPI.demo1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleController4 {
	
	@Autowired
	private EmployeeRepo er;// up to date

	@GetMapping("/dept")
	public ArrayList<String> getdept(){
		ArrayList<String> dept=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		dept.add(emt.getDept_name());
    		
    	}
    	return dept;

	}

}
