package com.interfacedemo;

public class PetrolEngine implements Engine, Company {

	@Override
	public void getEngineDetails() {
		System.out.println("This is a petrol engine..");
	}

}
