package com.example.demo6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleController {
	@Autowired
	private TruckRepo tr;
	@GetMapping("/Truck")
	public List<TruckEntity> joincol() {
		
		return tr.getjoin();
	}
}
