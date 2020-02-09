package com.practice.knowledge.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.knowledge.Model.Vehicle;
import com.practice.knowledge.Registory.ServiceRegistory;

@RestController
@RequestMapping("/Vehicle")
public class VehcileController {
	
	@Autowired
	private ServiceRegistory serviceRegistory;
	
	@PostMapping
	public void processServiceDetails(@RequestBody Vehicle vehicle)
	{
		serviceRegistory.getService(vehicle.getVehicleType()).process(vehicle);
	}

}
