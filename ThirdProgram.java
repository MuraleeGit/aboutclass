//calling stativ global variable, static block, static method using class
package com.k2js.aboutclass.practice;

import java.lang.System.*;

class EX1_SGV_SB_SM{
	
	static Comparable c=20;
	
	static{
		System.out.println("I am static block"); // static block will automatically com, no need to call
	}
	static void m(){
		System.out.println("I am static method");
	}
}
class EX1_SGV_SB_SM_test{
	public static void main(String...abc){
		System.out.println(EX1_SGV_SB_SM.c);
		EX1_SGV_SB_SM.m();
		
	}
}
//Output
//D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutclass\src>java -cp ..\bin com.k2js.aboutclass.practice.EX1_SGV_SB_SM.test
//Error: Could not find or load main class com.k2js.aboutclass.practice.EX1_SGV_SB_SM.test
//
//D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutclass\src>java -cp ..\bin com.k2js.aboutclass.practice.EX1_SGV_SB_SM_test
//I am static block
//20
//I am static method