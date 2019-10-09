//static nested calss
package com.k2js.aboutclass.practice;

class EX2_SNC{
	static class A{
		static int i=10;
			   int j=20;
	
		public static void main(String...abc){
			
			System.out.println("I am SNC static method");
	
		}
		public void m(){
			System.out.println("I am SNC Non static method");
	
		}
	}
	public static void main(String...abc){
		System.out.println("I am outer class main method");
		System.out.println(EX2_SNC.A.i);
		System.out.println(new EX2_SNC.A().j);
		System.out.println(new EX2_SNC.A(){}.j);
		EX2_SNC.A a1=new EX2_SNC.A();
		System.out.println(a1.j);
		EX2_SNC.A a2= new EX2_SNC.A(){};
		System.out.println(a2.j);
		EX2_SNC.A.main();
		a1.m();
		a2.m();
		
	}
}
//Compiling and output.
//D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutclass\src>javac -d ..\bin com\k2js\aboutclass\practice\FourthProgram.java
//
//D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutclass\src>java -cp ..\bin com.k2js.aboutclass.practice.EX2_SNC
//I am outer class main method
//10
//20
//20
//20
//20
//I am SNC static method
//I am SNC Non static method
//I am SNC Non static method
//