package com.practice.knowledge.Model;

import java.io.Serializable;

public class Vehicle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3052530333953727493L;
	private String vehicleName;
	private String vehicleType;
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehcileName) {
		this.vehicleName = vehcileName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + ", vehicleType=" + vehicleType + "]";
	}
	
	
	
}
