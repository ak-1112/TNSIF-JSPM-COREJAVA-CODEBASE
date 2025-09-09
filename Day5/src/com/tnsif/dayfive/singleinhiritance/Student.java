package com.tnsif.dayfive.singleinhiritance;

public class Student extends citizen {
	private int rollNo;
	private String collegename;
	public Student()
	{
		super();
	}
	public Student(String name,String adharNo,String address,long phone,int rollNo,String collegename)
	{
		super(name,adharNo,address,phone);
	this.rollNo=rollNo;
	this.collegename=collegename;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public String getCollegeName()
	{
		return collegename;
		
	}
	public void setCollegename(String collegename)
	{
		this.collegename=collegename;
	}
@Override 
public String toString()
{
	return "Student [rollNo=" + rollNo + ", collegename=" + collegename + ", getName()=" + getName()
	+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
	+ "]";
}
}
