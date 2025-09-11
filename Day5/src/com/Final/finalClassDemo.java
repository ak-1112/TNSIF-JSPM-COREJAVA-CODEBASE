package com.Final;

final class FinalClass{
	void show() {
		System.out.println("final class cannot be inhirited");
	}
}

//class Demo extends FinalClass
//{
//	
//}
public class finalClassDemo {
	public static void main(String args[])
	{
		FinalClass f1=new FinalClass();
		f1.show();
	}
	

}
