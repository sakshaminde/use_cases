package com.example.demo7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@Autowired
	private ClientsRepo cr;
	@GetMapping("/details")
	/*public ResponseEntity<String> data(@RequestBody List<ClientsEntity> ClientsData)
	{
		cr.saveAll(ClientsData);
		return ResponseEntity.ok("Data saved");*/
	
	public List<ClientsEntity> joincol() {
		
		return cr.getjoin();
	}

}
