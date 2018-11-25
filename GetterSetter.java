package com.javabasic.variables;

public class GetterSetter {

	private int x = 40;
	double y = 60;
	
	 GetterSetter(int a,double b) {
		// TODO Auto-generated constructor stub
		x=a;
		y=b;
		
		
	}
	 
	 

	void add() {

		double z = x + y;
		System.out.println(z);

	}

	void sub() {
		double a = x - y;
		System.out.println(a);

	}

	int getX() {
		return x;
	}

	void setX(int a) {
		
		x=a;
	}
	

}
