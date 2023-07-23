package com.interfacedemo;

public class Test {

	public static void main(String[] args) {

		Engine engine1 = new PetrolEngine();
		Engine engine2 = new DieselEngine();
		Engine engine3 = new CNGEngine();

		engine2.getEngineDetails();

		engine3.getEngineDetails();

		engine1.getEngineDetails();
		
		System.out.println(engine1.id);
		engine1.getEngineDetails();//cannot change final variable

	}

}
