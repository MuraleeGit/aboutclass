//creating a program for non static context
package com.k2js.aboutclass.practice;
class EX5_NIC{
		
		int i=10000;
		{
			System.out.println("I am a non static block");
		}
		EX5_NIC(){
			
		System.out.println("I am constructor");
		}
		void m(){
			System.out.println("I am a non static methid");
		}
		class N{
			static final int i=-10;
			int j=20;
			void m(){
			
			System.out.println("I am NS inner class non static method");
		}
			
}

}
class EX5_NIC_Test{
	public static void main(String...abc){
		EX5_NIC a1=new EX5_NIC();
		System.out.println(a1.i);
		a1.m();
		System.out.println(EX5_NIC.N.i);
		System.out.println(a1.new N().j);
		a1.new N(){}.m();
		
	}


}
//Output
//D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutclass\src>java -cp ..\bin com.k2js.aboutclass.practice.EX5_NIC_Test
//I am a non static block
//I am constructor
//10000
//I am a non static methid
//-10
//20
//I am NS inner class non static method
//
//
//
//
