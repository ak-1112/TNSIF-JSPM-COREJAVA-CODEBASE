package com.Static;

public class Static {
	private int section;
	private static int srNo;
	static {
		System.out.println("within the static block");
		srNo=1000;
		//section=2000;
	
	}
	Static()
	{
		System.out.println("within default constructor");
		srNo++;
		section++;
	}
		@Override
		public String toString() {
			return "Myclass[serial no"+srNo+",section="+section+"]";
		}
		//static method
		static void display()
		{
			//System.out.println("Section:"+section);
			System.out.println("serial no:"+srNo);
		}
	
	
	

}
