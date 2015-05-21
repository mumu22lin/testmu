package com.mu.muls.controller;










public class SimpleTest{
	
	public static void main(String[] args) {
	
		AbsSub  ob = new AbsSub();
		
	}
	
}








 class AbsSub extends Abs{
	
	public void m1(){
		
		System.out.println("m1 ");
	}
	

}




abstract class   Abs{
	
	public Abs(){
		System.out.println("abs...");
		m1();
	}
	
	
	public abstract void m1();
	
}
