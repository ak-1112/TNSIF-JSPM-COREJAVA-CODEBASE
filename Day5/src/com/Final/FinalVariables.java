package com.Final;

public class FinalVariables {
	//final int x;//final should be initialized
	final int x=100;
	//declare a static blank final varible
	final static int y;
	
	final static int z=10;
	//instance method 
	void change() {
		//x=30;
		//z=100;
		//y=23;
	}
	
	
@Override
public String toString() {
	return"Finalvariables[x="+x+",y="+y+"]";
			
}
static {
	//z=26;
	y=56;
}
static
{
	//y=54;cannot change if we already assign value in final block/code
	System.out.println("value of y="+y);
}

}
