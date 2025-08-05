package com.newjava;

public class password {
	public static void main(String[] args) {
		
		String username="aniket1234";
		String password="aniket1234";
		System.out.println("welcome to login");
		if(username=="Aniket")
		{
			if(password=="aniket1234")
			{
				System.out.println("login succesfully");
			}
			else
			{
				System.out.println("you entered wrong msg");
			}
		}
		else {
			if(!(password=="aniket1234")) {
				System.out.println("username and password both are wrong");
			}else {
				System.out.println("you entered the wrong username");
			}
		}
	}
}
	
