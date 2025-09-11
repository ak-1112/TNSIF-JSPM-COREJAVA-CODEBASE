package com.Static;

public class Employee {
//decalre instnace variable
	private String name;
	private int id;
	
	//declare a static variable comapny with data type
	//tns which is common for all the object
	static String CompanyName="TNS";

   public 	Employee(String name,int id){
       this.name=name;
       this.id=id;
       
	}
   @Override 
   public String toString() {
	   return "Employee[name="+name+",id="+id+",Company="+CompanyName+"]";
   }
}
