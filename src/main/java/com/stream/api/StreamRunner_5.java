package com.stream.api;

import java.util.ArrayList;
import java.util.List;

import com.stream.api.model.PersonInfo;

public class StreamRunner_5 {

	static int i = 0, j=0;
	
	public static void main(String[] args) {
		List<PersonInfo> persons = populatePersonInfos();
		persons.stream().forEach(System.out::println);
		System.out.println("All Match returned  "+
			persons.stream().filter(p-> {
				boolean flag = p.getAge() > 18;
				System.out.println("[filter 1 - age>18 ] pass #"+i++ + "| returns :" + flag);
				return flag;
			})
			.allMatch(p-> {
				boolean flag = p.getCountry().equals("US");
				System.out.println("[allMatch -Country='US'] pass #"+j++ + "| returns : " + flag);
				return flag;
			})
		);
		

	}

	private static List<PersonInfo> populatePersonInfos(){
		PersonInfo PersonInfo1 = new PersonInfo("JohnA", "US", 20, 67);
		PersonInfo PersonInfo2 = new PersonInfo("JohnB", "India", 18, 60);
		PersonInfo PersonInfo3 = new PersonInfo("JohnC", "UK", 33, 85);
		PersonInfo PersonInfo4 = new PersonInfo("JohnD", "Europe", 40, 90);
		PersonInfo PersonInfo5 = new PersonInfo("JohnE", "India", 35, 92);
		PersonInfo PersonInfo6 = new PersonInfo("JohnF", "Germany", 22, 75);
		PersonInfo PersonInfo7 = new PersonInfo("JohnG", "JAPAN", 18, 64);
		PersonInfo PersonInfo8 = new PersonInfo("JohnH", "India", 25, 60);
		PersonInfo PersonInfo9 = new PersonInfo("JohnI", "US", 12, 35);
		PersonInfo PersonInfo10 = new PersonInfo("JohnJ", "Russia", 20, 60);
		List<PersonInfo> list = new ArrayList<PersonInfo>();
		list.add(PersonInfo1);list.add(PersonInfo2);
		list.add(PersonInfo3);list.add(PersonInfo4);
		list.add(PersonInfo5);list.add(PersonInfo6);
		list.add(PersonInfo7);list.add(PersonInfo8);
		list.add(PersonInfo9);list.add(PersonInfo10);
		return list;
	}
	
}
