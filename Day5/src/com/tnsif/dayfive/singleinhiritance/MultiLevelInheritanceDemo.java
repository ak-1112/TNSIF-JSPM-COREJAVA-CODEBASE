package com.tnsif.dayfive.singleinhiritance;


public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		
		City c=new City();
		c.setCityName("beed");
		c.setArea(12345.890f);
		c.setStateName("maharashtra");
		c.setLanguage("marathi");
		c.setCountryname("India");
		c.setCapital("Delhi");
		
		System.out.println(c);

	}

}