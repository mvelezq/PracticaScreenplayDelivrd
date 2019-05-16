package com.tcs.certificacion.reto.model.enums;

public enum DataRegister {

	NAME("MiguelVelez"),
	EMAIL("miavelez@bancolombia.com.co"),
	PASSWORD("ContraPrueba24*");
	
	
	private String value;
	
	private DataRegister(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}	
	
}
