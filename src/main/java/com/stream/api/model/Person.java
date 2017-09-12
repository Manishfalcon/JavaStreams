package com.stream.api.model;

public class Person {
	
	private String id;
	private String country;

	public Person(String id, String country) {
		super();
		this.id = id;
		this.country = country;
	}

	public String getId() {
		return id;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return getId();
	}

}
