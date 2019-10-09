//static interface program
package com.k2js.aboutclass.practice;

class EX3_SNC{
	interface A{
		static int i=10;
			   int j=20;
	
		public static void main(String...abc){
			
			System.out.println("I am SNC static method");
	
		}
		default public void m(){
			System.out.println("I am SNC Non static method");
	
		}
	}
	public static void main(String...abc){
		System.out.println("I am outer class main method");
		System.out.println(EX3_SNC.A.i);
		System.out.println(EX3_SNC.A.j);
		System.out.println(EX3_SNC.A.j);
		EX3_SNC.A a2= new EX3_SNC.A(){};
		EX3_SNC.A.main();
		a1.m();
		a2.m();
		new EX3_SNC.A().m();
	}
}
