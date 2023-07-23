package com.abstractclassdemo;

public abstract class Student {
	int id=123;

	public abstract void getData();

	public void getName() {
		System.out.println("Student name is>> Krushna");
	}

	public abstract int getId();
	
	
	Student(){
		System.out.println("Student abstract class constructor");
	}
}
	