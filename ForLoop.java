package com.javabasic.variables;

public class ForLoop {
	
	void  check() {
	for(int i=1;i<=20;i++) {
	if(i%2==0) {
		System.out.println(i);
		
	}
	}
	}
void check1() {
	for(int z=0;z<=100;z++) {
		
		if(z%4==0) {
			
			System.out.println("number is divisible by 4  "+z);
		}
	}
	
	
}

void check2() {
	int x=1;
	while(x<=5) {
		if(x%2==0) {
			System.out.println(x);
			
		
		}
		x++;
	}
	
	
}
void check3() {
	
	for(int y=2;y<=20;y++)
	{int k=0;
		for(int i=2;i<=y/2;i++) {
			if(y%i==0) {
				System.out.println(y+" is not  prime");
				k=1;
				break;
				
			}
			
			}
		if(k==0) {System.out.println(y);}
			}
	
		}
		
	
	

public static void main(String args[]) {
	ForLoop l=new ForLoop();
	//l.check();
	//l.check1();
	//l.check2();
	l.check3();
	
}
}

	