package com.javabsic.assignment;

public class PracticeCode {

	int x;
	static int y = 40;
	// y++;
	// x=23;
	String name = "This is practise exerc";

	static void useVariables() {
		PracticeCode p = new PracticeCode();

		System.out.println(y);
		y++;
		System.out.println(y);
		y += 5;
		System.out.println(y);

		p.x = p.x + y;
		System.out.println(y);

	}
static void useVariables1() {
	PracticeCode p=new PracticeCode();
	p.x=90;
	System.out.println(y);//40
	--y;
	System.out.println(y);//39
	y-=5;
	System.out.println(y);//34
	p.x=p.x-y;
	System.out.println(y);//34
	
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PracticeCode.useVariables();
      PracticeCode.useVariables1();
	}

}
