package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.stream.api.model.PersonInfo;

public class StreamRunner_2 {

	public static void main(String[] args) {
		List<PersonInfo> persons = populatePersons();
		System.out.println("-----------------Obtain US & Non-US based persons using partitionBy and groupingBy ---------------------");
		System.out.println(persons.stream().collect(Collectors.partitioningBy((PersonInfo p) -> p.getCountry().equals("India"))));
		System.out.println(persons.stream().collect(Collectors.groupingBy((PersonInfo p)-> p.getCountry().equals("US"))));
	
		System.out.println("-----------------Count US & Non-US based persons using partitionBy and groupingBy ---------------------");
		System.out.println(persons.stream().collect(Collectors.groupingBy((PersonInfo p)->p.getCountry().equals("US"), Collectors.counting())));
		System.out.println(persons.stream().collect(Collectors.partitioningBy((PersonInfo p)-> p.getCountry().equals("India"), Collectors.counting())));
		
	
	}
	
	private static List<PersonInfo> populatePersons(){
		PersonInfo person1 = new PersonInfo("person01", "US");
		PersonInfo person2 = new PersonInfo("person02", "India");
		PersonInfo person3 = new PersonInfo("person03", "UK");
		PersonInfo person4 = new PersonInfo("person04", "Europe");
		PersonInfo person5 = new PersonInfo("person05", "India");
		PersonInfo person6 = new PersonInfo("person06", "Germany");
		PersonInfo person7 = new PersonInfo("person07", "JAPAN");
		PersonInfo person8 = new PersonInfo("person08", "India");
		PersonInfo person9 = new PersonInfo("person09", "US");
		PersonInfo person10 = new PersonInfo("person010", "Russia");
		List<PersonInfo> list = new ArrayList<PersonInfo>();
		list.add(person1);list.add(person2);
		list.add(person3);list.add(person4);
		list.add(person5);list.add(person6);
		list.add(person7);list.add(person8);
		list.add(person9);list.add(person10);
		return list;
	}

}
