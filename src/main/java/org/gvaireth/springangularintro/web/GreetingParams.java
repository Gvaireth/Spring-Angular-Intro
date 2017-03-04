package org.gvaireth.springangularintro.web;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class GreetingParams {

	private String title;

	@NotNull
	@Valid
	private String name;

	@NotNull
	@Valid
	@Size(min = 2, max = 50)
	private String surname;

	@Max(value = 130)
	private int age;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
