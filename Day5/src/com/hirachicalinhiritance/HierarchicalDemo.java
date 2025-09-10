package com.hirachicalinhiritance;

public class HierarchicalDemo {

	public static void main(String[] args) {
		
		Person p1=new Person();
		System.out.println(p1);
		
//		Student s1=new Student("Aniket", "beed", "SY", 23.78f);
//
//		Employee e1=new Employee("Aniket", "beed", 1001, 123456, "CS");
		
		Person p;
		p=new Person("Aniket","Beed");
		System.out.println(p);
		
		p=new Employee("Vedant", "Pandharpur", 1002, 23456, "QA");
		System.out.println(p);
		
		p=new Student("Aditya", "Mumbai", "TY", 12345f);
		System.out.println(p);
				
		

	}

}