package com.javalex.ex;

public class student {
	private String name;
	private int age;
	private String number;
	private String gender;
	
	public student() {
		
	}
	public student(String n, int a, String num, String g) {
		this.name=n;
		this.age=a;
		this.number=num;
		this.gender=g;		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
