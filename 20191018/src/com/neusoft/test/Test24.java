package com.neusoft.test;

public class Test24 {
	private int i=1;
	public Test24(int i){		
		this.i=i;
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		Test24 t = new Test24(2);
		System.out.println(t.i);
	}
}
