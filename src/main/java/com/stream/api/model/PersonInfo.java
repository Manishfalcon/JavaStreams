package com.stream.api.model;

public class PersonInfo {
	private String name;
	private String country;

	public PersonInfo(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return getName();
	}

}
