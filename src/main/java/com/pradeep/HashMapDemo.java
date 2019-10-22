package com.pradeep;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Demo1, String> hashMap = new HashMap<>();
		String s1 = new String("pradeep");
		String s2 = new String("pradeep");
		s2.intern();
		Demo1 d1 = new Demo1(1, "pradeep");
		Demo1 d2 = new Demo1(2, "pradeep");
		Demo1 d3 = new Demo1(1, "Raj");
		System.out.println(s1 == s2);
		System.out.println(hashMap.put(d1, "Cool"));
		System.out.println(hashMap.put(d2, "Hot"));
		System.out.println(hashMap.put(d3, "Handsome"));
		System.out.println("Displaying HashMap values: ");
		for (Demo1 key : hashMap.keySet()) {
			System.out.println(key + " : "+ hashMap.get(key));
		}
 
	}
	

}
class Demo1 {
	public Demo1(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	int rollNo;
	String name;
	
	@Override
	public int hashCode() {
		return rollNo;	
	}
	
	@Override
	public boolean equals(Object obj) {
		Demo1 dd = (Demo1) obj;
		return this.rollNo == dd.rollNo;
	}
	
	@Override
	public String toString() {
		return this.rollNo + ":" + this.name;
	}
	
}
