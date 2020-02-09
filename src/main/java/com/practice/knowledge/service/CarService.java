package com.practice.knowledge.service;

import org.springframework.stereotype.Service;

import com.practice.knowledge.Model.Vehicle;
import com.practice.knowledge.Registory.AdaptorService;

@Service("Car")
public class CarService implements AdaptorService<Vehicle>{

	@Override
	public void process(Vehicle request) {
		// TODO Auto-generated method stub
		System.out.println("Car Service**" + request.toString());
	}

}
