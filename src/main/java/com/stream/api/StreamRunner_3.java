package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.stream.api.model.Person;

public class StreamRunner_3 {

	
	public static void main(String[] args) {
		List<Person> persons = populatePersons();
		
		System.out.println("-----------------Obtain Collectors.toList() in order to obtain list of India based Person-------------------");
		List<Person> listOfUSPersons = persons.stream().filter(p->p.getCountry().equals("India")).collect(Collectors.toList());
		System.out.println(listOfUSPersons);
		Map<String, List<Person>> mapOfUSPerson = persons.stream().collect(Collectors.groupingBy(p -> p.getCountry(), Collectors.toList()));
		System.out.println(mapOfUSPerson);
		
		System.out.println("-----------------Obtain Collectors.toSet() in order to obtain list of US based Person-------------------");
		Set<Person> setOfUSPersons = persons.stream().filter(p->p.getCountry().equals("US")).collect(Collectors.toSet());
		System.out.println(setOfUSPersons);
		Map<String, Set<Person>> mapOfSets = persons.stream().collect(Collectors.groupingBy(p -> p.getCountry(), Collectors.toSet()));
		System.out.println(mapOfSets.get("US"));

		ArrayList<Person> aList = persons.stream().filter(p->p.getCountry().equals("India")).collect(Collectors.toCollection(ArrayList::new));
		Map<String, ArrayList<Person>> aPerson = persons.stream().collect(Collectors.groupingBy((Person p)->p.getCountry(), Collectors.toCollection(ArrayList::new)));
		System.out.println(aList);
		System.out.println(aPerson);
		
		//In a same way we can vector, hashset and stack based on our design requirement or data.
	
	}

	private static List<Person> populatePersons(){
		Person person1 = new Person("JohnA", "US");
		Person person2 = new Person("JohnB", "India");
		Person person3 = new Person("JohnC", "UK");
		Person person4 = new Person("JohnD", "Europe");
		Person person5 = new Person("JohnE", "India");
		Person person6 = new Person("JohnF", "Germany");
		Person person7 = new Person("JohnG", "JAPAN");
		Person person8 = new Person("JohnH", "India");
		Person person9 = new Person("JohnI", "US");
		Person person10 = new Person("JohnJ", "Russia");
		List<Person> list = new ArrayList<Person>();
		list.add(person1);list.add(person2);
		list.add(person3);list.add(person4);
		list.add(person5);list.add(person6);
		list.add(person7);list.add(person8);
		list.add(person9);list.add(person10);
		return list;
	}
	
}
