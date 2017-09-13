package com.stream.api.model;

public class PersonInfo {
	
	private String name;
	private String country;
	private Integer age;
	private Integer weight;

	public PersonInfo(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public PersonInfo(String name, String country, Integer age) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
	}
	
	public PersonInfo(String name, String country, Integer age, Integer weight) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public Integer getAge() {
		return age;
	}

	public Integer getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return "PersonInfo [name=" + name + ", country=" + country + ", age=" + age + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonInfo other = (PersonInfo) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
