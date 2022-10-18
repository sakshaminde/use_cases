package com.example.KPI.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service("test")
public class EmployeeService {
	
	@Autowired
		private EmployeeRepo er;
	
		@GetMapping("/samp")
		public List<EmployeeEntity> getSample() {
			
			return er.findAll();
			
	}
}
