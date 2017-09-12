/**
 * 
 */
package com.stream.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author hm
 *
 */
public class StreamRunnerBasic {

	static List<String> list = populateList();

	static Map<String, String> map = populateMap();

	public static void main(String[] args) {
		System.out.println("-----------------Obtain Stream from List---------------------");
		list.stream().forEach(val -> System.out.print(val + ", "));
		System.out.println("\n-----------------Obtain Stream from map using entrySet---------------------");
		map.entrySet().stream().forEach(System.out::println);
		System.out.println("-----------------Obtain Stream from map using keySet---------------------");
		map.keySet().stream().forEach(System.out::println);
		System.out.println("-----------------Obtain Stream from map using valueSet---------------------");
		map.values().forEach(System.out::println);
		System.out.println("-----------------Obtain Stream from String using chars()---------------------");
		"12345678ab".chars().forEach(val -> System.out.println(Character.toChars(val)));
		System.out.println("-----------------Obtain Stream from String using split()---------------------");
		Stream.of("A,B,C,1".split(",")).forEach(System.out::println);
		System.out.println("-----------------Obtain Stream from Array---------------------");
		Integer[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Stream.of(array).forEach(val -> System.out.print(val + ","));
		System.out.println("\n-----------------Obtain Stream of Values---------------------");
		Stream.of("One", "Two", "Three", "and So on").forEach(System.out::println);
		System.out.println("\n-----------------Obtain Stream from function Generate---------------------");
		Stream.generate(() -> Math.random()).limit(5).forEach(System.out::println);
		System.out.println("\n-----------------Obtain Stream from function Iterate---------------------");
		Stream.iterate(1, i -> i + 1).limit(10).forEach(System.out::println);
		System.out.println("\n-----------------Obtain Stream from builder---------------------");
		Stream.builder().add("Manish").add("Tinku").add("Sharmistha").build().forEach(System.out::println);
		System.out.println("\n-----------------Obtain Stream from Another Stream---------------------");
		list.stream().distinct().limit(2).sorted().forEach(System.out::println);
	}

	private static List<String> populateList() {
		List<String> list = new ArrayList<String>();
		list.add("listval1");
		list.add("listval2");
		list.add("listval3");
		list.add("listval1");
		list.add("listval2");
		list.add("listval4");
		return list;
	}

	private static Map<String, String> populateMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("mapkey1", "mapVal1");
		map.put("mapkey2", "mapVal2");
		map.put("mapkey3", "mapVal3");
		return map;
	}

}
