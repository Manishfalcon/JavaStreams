package com.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.stream.api.model.Person;

public class StreamRunner_1 {

	
	public static void main(String[] args) {
		List<Person> persons = populatePersons();
		System.out.println("-----------------Id's of all person from the US ---------------------");
		persons.stream().filter(person -> person.getCountry().equals("US"))
				.map(p -> "Id : " + p.getId() + ", Country : " + p.getCountry())
				.forEach(System.out::println);
		System.out.println("-----------------Id's of all person not from the US ---------------------");
		persons.stream().filter(person -> !person.getCountry().equals("US"))
				.map(p -> "Id : " + p.getId() + ", Country : " + p.getCountry())
				.forEach(System.out::println);
		System.out.println("---------------- Using toArray() method---------------------");
		Object[] object = persons.stream().toArray();
		Arrays.asList(object).forEach(obj -> System.out.println(((Person)obj).getId()));
		
		System.out.println("---------------- Using<A> A[] toArray(IntFunction<A[]> generator) method ---------------------");
		Person[] personsArray = persons.stream().toArray(Person[]::new);
		Arrays.asList(personsArray).forEach(person -> System.out.println(person.getCountry()));
		
		System.out.println("---------------- Object Sorting ---------------------");
		persons.stream()
						.sorted(Comparator.comparing(Person::getCountry))
						.forEach(val->System.out.println(val.getCountry()));
	}

	private static List<Person> populatePersons(){
		Person person1 = new Person("person01", "US");
		Person person2 = new Person("person02", "India");
		Person person3 = new Person("person03", "UK");
		Person person4 = new Person("person04", "Europe");
		Person person5 = new Person("person05", "India");
		Person person6 = new Person("person06", "Germany");
		Person person7 = new Person("person07", "JAPAN");
		Person person8 = new Person("person08", "CHINA");
		Person person9 = new Person("person09", "US");
		Person person10 = new Person("person010", "Russia");
		List<Person> list = new ArrayList<Person>();
		list.add(person1);list.add(person2);
		list.add(person3);list.add(person4);
		list.add(person5);list.add(person6);
		list.add(person7);list.add(person8);
		list.add(person9);list.add(person10);
		return list;
	}
	
}
