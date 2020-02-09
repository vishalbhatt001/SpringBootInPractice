package com.practice.knowledge.service;

import org.springframework.stereotype.Service;

import com.practice.knowledge.Model.Vehicle;
import com.practice.knowledge.Registory.AdaptorService;

@Service("Bus")
public class BusService  implements AdaptorService<Vehicle>{

	@Override
	public void process(Vehicle request) {
		// TODO Auto-generated method stub
		System.out.println("Bus Service**" + request.toString());
	}

}
