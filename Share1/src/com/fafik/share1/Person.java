package com.fafik.share1;

public class Person {
	
	private String firstname;
	private String surname;	
	private Integer age;
	
	
	public Person(String firstname, String surname, Integer age) {
		super();
		this.firstname = firstname;
		this.surname = surname;
		this.age = age;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [getFirstname=" + getFirstname() + ", getSurname()=" + getSurname() + ", getAge()=" + getAge()
				+ "]";
	}


	
	

	
}
