package com.example.KPI.demo1;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController1 {
		@Resource(name = "test")
		private EmployeeService emps;
		
		@GetMapping
		public List<EmployeeEntity> getSample()
		{
			return emps.getSample();
		}

}
