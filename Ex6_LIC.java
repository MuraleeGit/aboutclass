//where all we can write java program

package com.k2js.aboutclass.practice;

class LIC{
	
	public static void main(String...abc){
		if (true){
			class A{
				void m(){
					
					System.out.println("I am in the local inner class method");
					
				}
			}
			A a1= new A();
			a1.m();
			
	
	    }
		System.out.println("I am in main method");
		
	}

}
