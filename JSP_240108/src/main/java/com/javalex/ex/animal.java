package com.javalex.ex;

// 클래스 :: 객체를 찍어내는 틀
// JSP에서는 "자바 빈(JavaBean)"이라고 함
public class animal {
	// 멤버변수
	private String kinds;
	private String name;
	private int age;
	private String number;
	
	public animal(String k, String n, int a, String num) {
		this.kinds=k;
		this.name=n;
		this.age=a;
		this.number=num;
	}
	
	// get set 함수쌍
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
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
	
}
